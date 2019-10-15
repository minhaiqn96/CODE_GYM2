let canvas = document.getElementById("myCanvas");
let ctx = canvas.getContext("2d");
let x = canvas.width / 2;
let y = canvas.height - 50;
let dx = 3;
let dy = -3;
let ballRadius = 10;
let paddleHeight = 10;
let paddleWidth = 80;
let paddleX = (canvas.width - paddleWidth) / 2;
let rightPressed = false;
let leftPressed = false;
let start = new Date().getTime();
let score = "0";

function drawBall() {
    ctx.beginPath();
    colorBall=getRandomColor();
    ctx.arc(x, y, ballRadius, 0, Math.PI * 2);
    ctx.fillStyle = colorBall;
    ctx.fill();
    ctx.closePath();
}

function getRandomHex() {
    return Math.floor(Math.random() * 255);
}
function getRandomColor() {
    let red = getRandomHex();
    let green = getRandomHex();
    let blue = getRandomHex();
    return "rgb(" + red + "," + green + "," + blue + ")";
}

function drawPaddle() {
    ctx.beginPath();
    colorPaddle=getRandomColor();
    ctx.rect(paddleX, canvas.height - paddleHeight, paddleWidth, paddleHeight);
    ctx.fillStyle = colorPaddle;
    ctx.fill();
    ctx.closePath();
}

document.addEventListener("keydown", keyDownHandler, false);
document.addEventListener("keyup", keyUpHandler, false);
function keyDownHandler(e) {
    if (e.key == "Right" || e.key == "ArrowRight") {
        rightPressed = true;
    }
    else if (e.key == "Left" || e.key == "ArrowLeft") {
        leftPressed = true;
    }
}
function keyUpHandler(e) {
    if (e.key == "Right" || e.key == "ArrowRight") {
        rightPressed = false;
    }
    else if (e.key == "Left" || e.key == "ArrowLeft") {
        leftPressed = false;
    }
}

function drawScore() {
    let time = new Date().getTime() - start;
    console.log(time);
    score = Math.floor(time / 1000);
    ctx.font = "16px Arial";
    ctx.fillStyle = "#0095DD";
    ctx.fillText("Score: " + score, 8, 20);
}

function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    drawBall();
    drawPaddle();
    drawScore();

    if (x + dx > canvas.width - ballRadius || x + dx < ballRadius) {
        dx = -dx;
    }
    else if (y + dy < ballRadius) {
        dy = -dy;
    }
    else if (y + dy > canvas.height - (paddleHeight + 5)) {
        if (paddleX <= x && x <= paddleX + paddleWidth) {
            dy = -dy;
        }
        else {
            alert("GAME OVER");
            document.location.reload();
            clearInterval(interval);
        }
    }

    if (rightPressed && paddleX < canvas.width - paddleWidth) {
        paddleX = paddleX + 10;
    }
    else if (leftPressed && paddleX > 0) {
        paddleX = paddleX - 10;
    }
    x = x + dx;
    y = y + dy;
}

let interval = setInterval(draw, 10);
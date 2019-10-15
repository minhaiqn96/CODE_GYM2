var Circle = /** @class */ (function () {
    function Circle(radius, color) {
        this.radius = radius;
        this.color = color;
    }
    Circle.prototype.getRadius = function () {
        return this.radius;
    };
    Circle.prototype.getArea = function () {
        var areaCircle = Math.PI * this.radius * this.radius;
        return areaCircle;
    };
    return Circle;
}());
var circle1 = new Circle(10, "blue");
// var circle1 = {
//     radius: 10,
//     color: "blue"
// }
console.log(circle1.getRadius());
console.log(circle1.getArea());
// alert(circle1.getRadius());
// alert(circle1.getArea());

class Circle {
    radius: number;
    color: String;

    constructor(radius: number, color: string) {
        this.radius = radius;
        this.color = color;
    }

    getRadius(): number {
        return this.radius;
    }

    getArea(): number {
        var areaCircle = Math.PI * this.radius * this.radius;
        return areaCircle;
    }
    
}

var circle1 = new Circle(10, "blue");

// var circle1 = {
//     radius: 10,
//     color: "blue"
// }

console.log(circle1.getRadius());
console.log(circle1.getArea());

// alert(circle1.getRadius());
// alert(circle1.getArea());



public abstract class Shape {
	public abstract void draw();
}


class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("I am a Circle");
	}
}

class Rectancgle extends Shape {
	@Override
	public void draw() {
		System.out.println("I am a Rectangle");
	}
}


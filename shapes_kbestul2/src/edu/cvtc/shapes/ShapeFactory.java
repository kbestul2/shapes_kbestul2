package edu.cvtc.shapes;

public class ShapeFactory {
	private Dialog dialog;

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	public Shape make(ShapeType type) {
		
		if(type == null) {
	         return null;
		}
		
		if(type == ShapeType.Cuboid) {
			
			return new Cuboid(getDialog(), 1, 0.5f, 2);
         
		} else if(type == ShapeType.Cylinder) {
			
			return new Cylinder(getDialog(), 3, 5);
         
		} else if(type == ShapeType.Sphere) {
			
			return new Sphere(getDialog(), 7);
        }
		
		return null;
		
	}
	
}

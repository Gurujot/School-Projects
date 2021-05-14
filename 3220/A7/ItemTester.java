package code;

public class ItemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Part nut = new Part("Nut", 4.99);
		Part bolt = new Part("Bolt", 8.99);
		Part panel = new Part("Panel", 34.99);
		Assembly gizmo = new Assembly("Gizmo");
		gizmo.addItem(nut);
		gizmo.addItem(bolt);
		gizmo.addItem(panel);
		Assembly widget = new Assembly("Widget");
		widget.addItem(gizmo);
		widget.addItem(nut);
		
		System.out.println(nut);
		System.out.println(bolt);
		System.out.println(panel);
		System.out.println(gizmo);
		System.out.println(gizmo.getItems());
		System.out.println(widget);
		System.out.println(widget.getItems());
	}
}

package holo.interpreter.values.prototypes;

import holo.interpreter.values.primitives.IntegerValue;
import holo.interpreter.values.primitives.ListValue;

public class ListPrototype  {

	public static final Prototype<ListValue> PROTOTYPE;
	
	static {
		PROTOTYPE = new Prototype<>("List");
		
		PROTOTYPE.addFunction("size", (self, args) -> {
			return IntegerValue.get(self.size());
		});
		
		PROTOTYPE.addFunction("add", (self, args) -> {
			return self.addElement(args[0]);
		}, "val");
	}
	
}

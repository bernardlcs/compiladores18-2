package org.xtext.example.pascal.validation;

public class TypeInferer {
	public static int getTypeWeight(Type type) {
		switch (type.getRealType()) {
		
		case "integer":
			return 2;
		case "string":
			  return 3;
	
		}
	     
		  
		return -1;
	}

	public static Type greater(Type type1, Type type2) {
		if (type1 == null)
			return type2;
		if (type2 == null)
			return type1; 
		int type1Weight = getTypeWeight(type1);
		int type2Weight = getTypeWeight(type2);
		if (type1Weight > type2Weight)
			return type1;
		return type2;
	}
	
	public static boolean areTypesCompatibles(Type parent, Type child) {
		if (parent.getRealType().equals(child.getRealType()))
			return true;
		int parentWeight = getTypeWeight(parent);
		int childWeight = getTypeWeight(child);
		if (parentWeight == -1 || childWeight == -1)
			return false;
		return parentWeight >= childWeight;
	}

}

package org.xtext.example.mydsl.validation;

import org.xtext.example.mydsl.pascal.block;

public class Variable extends Element {

	private Type varType;
	private Object value;
	
	public Variable(String name, Type varType, boolean inherited, block containingBlock, ElementType type, Object value) {
		super(name, type, inherited, containingBlock);
		this.varType = varType;
		this.value = value;
	}
	
	public Variable(String name) {
		this(name, null, false, null, ElementType.VARIABLE, null);
	}

	public Variable(String name, Type varType, boolean inherited, block containingBlock, ElementType type) {
		this(name, varType, inherited, containingBlock, type, type == ElementType.PARAMETER ? 0 : null);
	}
	
	public Type getVarType() {
		return varType;
	}

	public void setVarType(Type varType) {
		this.varType = varType;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	@Override
	public Element clone() {
		return new Variable(this.name, this.varType, this.inherited, this.containingBlock, this.type, this.value);
	}

	@Override
	public String toString() {
		return this.varType.toString();
	}
}

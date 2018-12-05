package org.xtext.example.pascal.validation;

import java.util.TreeSet;

public class AdaptativeTreeSet<E> extends TreeSet<E> {
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean add(E e) {
		if (e instanceof Variable) {
			if (((Variable) e).containingBlock == null) {
				throw new RuntimeException("Invalid variable.");
			}
		} 
		if (this.contains(e)) {
			this.remove(e);
		}
		return super.add(e);
	}
}

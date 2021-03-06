package com.loki2302.dom.expression.literal;

import com.loki2302.dom.expression.DOMExpression;
import com.loki2302.dom.expression.DOMExpressionVisitor;

public class DOMFalseBoolLiteralExpression implements DOMExpression {
	@Override
	public <T> T accept(DOMExpressionVisitor<T> visitor) {
		return visitor.visitFalseBoolLiteralExpression(this);
	}		 
}
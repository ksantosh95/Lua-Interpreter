package luaCompiler.AST;

import static luaCompiler.Token.Kind.KW_false;

import luaCompiler.Token;

public class ExpFalse extends Exp {

	public ExpFalse(Token firstToken) {
		super(firstToken);
	}
	
	public static final ExpFalse constantFalse = new ExpFalse(new Token(KW_false,"false",0,0));

	@Override
	public String toString() {
		return "ExpFalse []";
	}



	@Override
	public int hashCode() {
		return 0;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}



	@Override
	public Object visit(ASTVisitor v, Object arg) throws Exception {
		return v.visitExpFalse(this,arg);
	}

}

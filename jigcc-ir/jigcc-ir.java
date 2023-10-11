import java.utils.Hashtable;

public class IRAbsyn {
	public IRAbsyn next;
	public IRAbsyn prev;
	public IRAbsyn parent;

	public enum AbsynType {
		STR_LIT, INT_LIT, FLOAT_LIT, 
		INSTRUCTION, OPERATOR, PUNCTUATION,
		VARIABLE,
	}

	public AbsynType abstype;
	public Object 	 value;
}

public class IROpCode {
	public static final int	 value;
	public static final int[] params;
	public static int nparams;
	public static String translated;
	public static IRAbsyn translator;

	public void IROpCode(int val) { this.value = val; }
	public void addParam(int param) { this.params[this.nparams++] = param; }
	public void translate(void) {
		// todo
	}	
}

public class Label { 
	public static final int 	location;
	public static final String	name;

	public void Label(int loc, String nm) { this.location = loc; this.name = nm; }
}

public class JigccIR {
	static Hashtable<String, String> symbolsTbl;
	static Hashtable<String, byte>   instructionsTbl;
	static Hash

}

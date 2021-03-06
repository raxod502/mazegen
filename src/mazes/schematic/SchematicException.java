package mazes.schematic;

@SuppressWarnings("serial")
public final class SchematicException extends Exception {
	
	private final boolean displayMessage;
	public boolean displayMessage() {
		return displayMessage;
	}
	
	public SchematicException(String message, boolean displayMessage) {
		super(message);
		this.displayMessage = displayMessage;
	}
	
}

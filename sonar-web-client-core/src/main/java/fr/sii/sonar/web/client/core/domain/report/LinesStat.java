package fr.sii.sonar.web.client.core.domain.report;

public class LinesStat {

	/**
	 * The total number of lines in the file
	 */
	private long nbLines;

	/**
	 * The number of lines of code in the file
	 */
	private long nbCloc;

	/**
	 * The number of lines of comments in the file
	 */
	private long nbComments;

	public long getNbLines() {
		return nbLines;
	}

	public void setNbLines(long nbLines) {
		this.nbLines = nbLines;
	}

	public long getNbCloc() {
		return nbCloc;
	}

	public void setNbCloc(long nbCloc) {
		this.nbCloc = nbCloc;
	}

	public long getNbComments() {
		return nbComments;
	}

	public void setNbComments(long nbComments) {
		this.nbComments = nbComments;
	}
}
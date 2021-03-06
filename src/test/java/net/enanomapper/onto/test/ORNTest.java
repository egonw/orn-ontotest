package net.enanomapper.onto.test;

import java.util.Arrays;
import java.util.List;

public class ORNTest extends AbstractOntologyTest {

	@Override
	protected List<String> getOntologyResource() {
		String root = AbstractOntologyTest.ROOT;
		if (System.getProperty("ROOT") != null) {
			root = System.getProperty("ROOT");
		}
		return Arrays.asList(
		    root + "ORNOntology/openrisknet.owl"
		);
	}

}

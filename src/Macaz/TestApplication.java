/*
 * Copyright (c) 2019 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package Macaz;

public class TestApplication {

	Depot dp = new DepotImpl();

	{
		dp = new DepotImpl();
		dp.addLine("L1");
		dp.addLine("L2");
		dp.addLine("L3");
		dp.addLine("L4");

	}
}

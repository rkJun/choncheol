package com.appspot.choncheol.comm.db;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public class CommonPMF {

	private static final PersistenceManagerFactory pmfInstance = JDOHelper
			.getPersistenceManagerFactory("transactions-optional");

	private CommonPMF() {
	}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}

}
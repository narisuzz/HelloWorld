package com.narisu.interfac;

public class Interface03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBInterface dbinterface = new DBInterface();
		t(dbinterface);
		OracleDB oracledb = new OracleDB();
		t(oracledb);

	}
	
	public static void t(DbInteface db) {
		db.connect();
		db.close();
	}

}

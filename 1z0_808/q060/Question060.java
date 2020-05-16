package com.wealth.certificate.dumps_1z0_808.question060;

public class Question060 {
	int num_players;
	String name, ground_condition;
	Question060(int np, String sname, String sground){ num_players = np;
	name = sname;
	ground_condition = sground;
		}
	}
	class Cricket extends Question060 {
	int num_umpires;
	int num_substitutes;
	Cricket() {
		super(11, "Cricket", "Condidtion OK"); num_umpires =3;
		num_substitutes=2;
		}
	
	}


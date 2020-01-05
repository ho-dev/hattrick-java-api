package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchRoleId {
	Keeper(100),
	RIGHT_BACK(101),
	RIGHT_CENTRAL_DEFENDER(102),
	MIDDLE_CENTRAL_DEFENDER(103),
	LEFT_CENTRAL_DEFENDER(104),
	LEFT_BACK(105),
	RIGHT_WINGER(106),
	RIGHT_INNER_MIDFIELD(107),
	MIDDLE_INNER_MIDFIELD(108),
	LEFT_INNER_MIDFIELD(109),
	LEFT_WINGER(110),
	RIGHT_FORWARD(111),
	MIDDLE_FORWARD(112),
	LEFT_FORWARD(113),
	SUBSTITUTION_KEEPER(114),
	SUBSTITUTION_DEFENDER(115),
	SUBSTITUTION_INNER_MIDFIELD(116),
	SUBSTITUTION_WINGER(117),
	SUBSTITUTION_FORWARD(118),
	//Not present in documentation
    ADDITIONAL_SLOT(119),
	//TODO same value
	SUBSTITUTION_KEEPER_2(200),
	SUBSTITUTION_CENTRAL_DEFENDER(201),
	SUBSTITUTION_WING_BACK(202),
	SUBSTITUTION_INNER_MIDFIELDER(203),
	//TODO same value
	SUBSTITUTION_FORWARD_2(204),
	//TODO same value
	SUBSTITUTION_WINGER_2(205),
	SUBSTITUTION_EXTRA(206),
	BACKUP_KEEPER(207),
	BACKUP_CENTRAL_DEFENDER(208),
	BACKUP_WING_BACK(209),
	BACKUP_INNER_MIDFIELDER(210),
	BACKUP_FORWARD(211),
	BACKUP_WINGER(212),
	BACKUP_EXTRA(213),
	SET_PIECES(17),
	CAPTAIN(18),
	REPLACED_PLAYER_1(19),
	REPLACED_PLAYER_2(20),
	REPLACED_PLAYER_3(21),
	PENALTY__AKER_1(22),
	PENALTY_TAKER_2(23),
	PENALTY_TAKER_3(24),
	PENALTY_TAKER_4(25),
	PENALTY_TAKER_5(26),
	PENALTY_TAKER_6(27),
	PENALTY_TAKER_7(28),
	PENALTY_TAKER_8(29),
	PENALTY_TAKER_9(30),
	PENALTY_TAKER_10(31),
	PENALTY_TAKER_11(32);

    private int value;

    MatchRoleId(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

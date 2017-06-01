package com.springinaction.knights;

/**
 * 勇敢的骑士,可以面对多种多样的需求
 * 
 * @author endless
 *
 */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}

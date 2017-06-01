package com.springinaction.knights;

/**
 * 单一职能的骑士,只能执行单一的Damsel任务
 * 
 * @author endless
 *
 */
public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}

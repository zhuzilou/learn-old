package com.springinaction.knights;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

	@Test
	public void testEmbarkOnQuest() {
		Quest mockQuest = Mockito.mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, Mockito.times(1)).embark();
	}

}

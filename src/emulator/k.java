package emulator;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 


public class k {

	public boolean m_doZ;
	public int m_aI;
	public int m_intI;
	public int m_forI;
	public int m_newI;
	public Element elements[];

	public k() {
		elements = new Element[6];
		for (int i = 0; i < 6; i++)
			elements[i] = new Element();

		_avV();
	}

	public void _avV() {
		m_aI = m_forI = m_newI = 0;
		m_doZ = true;
		for (int i = 0; i < 6; i++)
			elements[i].init();

	}
}

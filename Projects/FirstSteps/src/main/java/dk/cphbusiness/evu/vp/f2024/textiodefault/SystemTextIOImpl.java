package dk.cphbusiness.evu.vp.f2024.textiodefault;

import java.util.Scanner;

public class SystemTextIOImpl implements TextIO
{
	private static Scanner scanner = new Scanner(System.in);

	@Override
	public void put(String str)
	{
		System.out.print(str);
	}

	@Override
	public void clear()
	{
		for(int i = 0; i < 100; ++i)
		{
			System.out.println();
		}
	}

	@Override
	public String get()
	{
		return scanner.nextLine();
	}
}

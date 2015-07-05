package ru.lesson.lessons;

//import ru.lessons.lesson_8.UserException;

/**
 * ����� ��������� �����������.
 */
public class Calculator {
	/**
	 ��������� ����������.
	 */
	private int result;

	/**
	 * ��������� ���������.
	 * @param params ��������� ������������.
	 */
	public void add(int ... params) {
		for (int param : params) {
			this.result += param;
		}
	}

	/**
	 * �������� �������.
	 * @param args �������� ���������.
	 * @throws ru.lessons.lesson_8.UserException ���� ���������� ���, ���������� ����������.
	 */
	public void div(int ... args) /*throws UserException*/ {
		if (args.length > 0) {
			this.result = args[0];
			for (int i=1; i<args.length; i++)
			{
				if (args[i] == 0) {
					throw new IllegalArgumentException("You try to div by 0. Please change arg!");
				}
				this.result /= args[i];
			}
		} /*else {
			throw new UserException("You should enter args!");
		}*/
	}

	/**
	 * �������� ���������.
	 * @return ��������� ����������.
	 */
	public int getResult() {
		return this.result;
	}

	/**
	 * �������� ��������� ����������.
	 */
	public void cleanResult() {
		this.result = 0;
	}
}
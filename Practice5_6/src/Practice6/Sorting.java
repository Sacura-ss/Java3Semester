package Practice6;

public class Sorting {
    private Student iDNumber[];

    public Sorting(Student[] iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void sort() {
        for (int left = 0; left < iDNumber.length; left++) {
            // Вытаскиваем значение элемента
            Student nowElement = iDNumber[left];
            int value = iDNumber[left].getiD();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение большее — передвигаем меньший элемент дальше
                if (value > iDNumber[i].getiD()) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    // Если вытащенный элемент меньше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            //iDNumber[i + 1].setiD(value);
            iDNumber[i+1] = nowElement;
        }

    }

}

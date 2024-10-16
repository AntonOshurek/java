package com.aspose.cell;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class main {
    public static void main(String[] args) {
        try {
            // Создание нового объекта Workbook
            Workbook workbook = new Workbook();

            // Добавление нового листа
            workbook.getWorksheets().add("HelloWorldPage");

            // Установка значения в ячейку (строка 0, столбец 0)
            workbook.getWorksheets().get("HelloWorldPage").getCells().get(0, 0).setValue("HelloWorldCell");

            // Сохранение файла Excel
            workbook.save("HelloWorld.xlsx");

            System.out.println("Файл успешно сохранён!");

        } catch (Exception e) {
            // Обработка исключения
            System.err.println("Произошла ошибка при сохранении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

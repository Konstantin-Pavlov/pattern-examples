package org.example.patterns.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Создаем объекты-листья
        Graphic circle = new Circle();
        Graphic square = new Square();

        // Создаем компоновщик и добавляем в него листья
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(circle);
        compositeGraphic.add(square);

        // Создаем еще один компоновщик
        CompositeGraphic anotherComposite = new CompositeGraphic();
        anotherComposite.add(new Circle());

        // Вкладываем компоновщики друг в друга
        compositeGraphic.add(anotherComposite);

        // Рисуем все графические объекты
        compositeGraphic.draw();
    }
}

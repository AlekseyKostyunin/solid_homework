1. Принцип единой ответственности.
В классе User содержатся методы сохранения и печати отчетов о пользователях.
К примеру, если нам потребуется печатать отчеты в разных форматах, то в классе User
будет много методов по отчетам, что не относится к его ответственности.
Таким образом, нарушен принцип единой ответственности.
Как исправить:
Создать три интерфейса: Persisterable, IUser, Reportable и передать им нужный функционал 

2. Метод save в классе User напрямую зависит от реализации этого метода в классе Persister.
Этим нарушается принцип открытости-закрытости, так как изменяя метод save() в Persister, мы тем самым меняем 
функционал класса User.
Как исправить:
Удалить метод save из класса User, и реализовать его в интерфейсе Persisterable.

3. Принцип подстановки Лисков.
В проекте отсутствуют классы наследники от User, Persister - принцип не нарушен.

4. Принцип разделения интерфейсов.
В проекте отсутствую интерфейсы - принцип не нарушен.

5. Принцип инверсии зависимостей.
Конструктор класса Persister напрямую зависит от класса User. 
Как исправить:
Реализовать проект таким образом, чтобы модули зависели от абстракций. Решение из пункта № 1.
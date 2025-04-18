
### 1. [Введение в структуры данных](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%92%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5%20%D0%B2%20%D1%81%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D1%8B%20%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85.md)
   - **Что такое структуры данных:** объяснение основных концепций и зачем они нужны.
   - **Сложность алгоритмов (O(n)):** что такое O(n), примеры различных сложностей (O(1), O(log n), O(n), O(n²)), и почему это важно при выборе структур данных.

### 2. [Иерархия интерфейсов и коллекций](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%98%D0%B5%D1%80%D0%B0%D1%80%D1%85%D0%B8%D1%8F%20%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D0%BE%D0%B2%20%D0%B8%20%D0%BA%D0%BE%D0%BB%D0%BB%D0%B5%D0%BA%D1%86%D0%B8%D0%B9.md)
   - **Коллекции в Java:** обзор иерархии интерфейсов, начиная с `Collection`, и переход к основным интерфейсам: `List`, `Set`, `Queue`, `Deque`.
   - **Map:** обсуждение, как `Map` отличается от других коллекций и почему он не является частью иерархии `Collection`.
   - **Примеры классов, реализующих эти интерфейсы:** `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, и другие.

### 3. [Основные реализации коллекций](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5%20%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8%20%D0%BA%D0%BE%D0%BB%D0%BB%D0%B5%D0%BA%D1%86%D0%B8%D0%B9.md)
   - Обсуждение самых распространенных классов:
     - **List**: `ArrayList`, `LinkedList`.
     - **Set**: `HashSet`, `TreeSet`.
     - **Queue**: `PriorityQueue`, `ArrayDeque`.
     - **Map**: `HashMap`, `TreeMap`.
   - Особенности каждой реализации, их плюсы и минусы.

### 4. [Сравнение коллекций по эффективности](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%A1%D1%80%D0%B0%D0%B2%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%20%D0%BA%D0%BE%D0%BB%D0%BB%D0%B5%D0%BA%D1%86%D0%B8%D0%B9%20%D0%BF%D0%BE%20%D1%8D%D1%84%D1%84%D0%B5%D0%BA%D1%82%D0%B8%D0%B2%D0%BD%D0%BE%D1%81%D1%82%D0%B8.md)
   - Представление таблицы сложности операций для коллекций (`add`, `remove`, `contains`, `get`) для каждой из наиболее часто используемых коллекций.
   - Объяснение, в каких случаях стоит выбирать ту или иную коллекцию на основе этой таблицы.

### 5. [Примеры использования Iterator и Iterable](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%9F%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D1%8B%20%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F%20Iterator%20%D0%B8%20Iterable.md)
   - **Что такое Iterator и Iterable:** объяснение иерархии этих интерфейсов и их назначения.
   - **Реализация своего итератора:** показать пример кода, реализующего интерфейсы `Iterator` и `Iterable`.
   - Объяснение, как использовать итераторы с коллекциями и зачем это может быть полезно.

### 6. [Часто используемые методы из класса Collections](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%A7%D0%B0%D1%81%D1%82%D0%BE%20%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D1%83%D0%B5%D0%BC%D1%8B%D0%B5%20%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D1%8B%20%D0%B8%D0%B7%20%D0%BA%D0%BB%D0%B0%D1%81%D1%81%D0%B0%20Collections.md)

- **Сортировка коллекций**: использование `Collections.sort()` для сортировки списков и как работает метод `sort` с компараторами.
- **Создание неизменяемых и пустых коллекций**:
    - `Collections.singletonList(element)` — создание списка с одним элементом.
    - `Collections.emptyList()`, `Collections.emptySet()`, `Collections.emptyMap()` — создание пустых неизменяемых коллекций.
- **Другие полезные методы**:
    - `Collections.reverse()` — разворот элементов списка.
    - `Collections.shuffle()` — случайное перемешивание элементов в коллекции.
    - `Collections.max()` и `Collections.min()` — поиск максимального и минимального элемента.

### 7. [Дополнительно NavigableSet](%D0%9E%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5%2F%D0%94%D0%BE%D0%BF%D0%BE%D0%BB%D0%BD%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%20NavigableSet.md)



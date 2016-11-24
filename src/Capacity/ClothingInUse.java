package Capacity;

import Constant.TypeOfClothing;
import Utilits.UserChoice;
import WorldObjeckt.InanimateObj.AmmunitionClothing;
import java.util.HashMap;

import static Constant.TypeOfClothing.*;

/**
 * Created by nimtego_loc on 23.11.2016.
 */
public class ClothingInUse {
    private HashMap<TypeOfClothing, AmmunitionClothing> clothing =
                new HashMap<>();

    public ClothingInUse() {
        this.clothing.put(HEAD, null);
        this.clothing.put(SHOULDERS, null);
        this.clothing.put(BODY, null);
        this.clothing.put(HANDS, null);
        this.clothing.put(LEGS, null);
        this.clothing.put(FEET, null);
    }
    public HashMap<TypeOfClothing, AmmunitionClothing> getClothing() {
        return clothing;}
    public void setClothing(HashMap<TypeOfClothing, AmmunitionClothing> clothing) {
        this.clothing = clothing;}
    public AmmunitionClothing getClothingByKey(final TypeOfClothing typeOfClothing) {
        return clothing.get(typeOfClothing);
    }
    public void setClothingByKey(final TypeOfClothing typeOfClothing, final AmmunitionClothing ammunitionClothing) {
        AmmunitionClothing saveOld = null;
        if (clothing.get(typeOfClothing) == null) {
            clothing.put(typeOfClothing, ammunitionClothing);
        }
        else {
            if(UserChoice.yesOrNot("Заменить на " +ammunitionClothing.getName() +" ?")) {
                clothing.put(typeOfClothing, ammunitionClothing);
            }
        }
    }
}
/*
                for(Map.Entry<TypeOfClothing, AmmunitionClothing> item : clothing.entrySet()){
                    System.out.println("Ключ: "+item.getKey() +" Значение: " +item.getValue());
    Отображения представляют такие наборы, в которых каждый объект представляет пару "ключ-значение". Такие коллекции облегчают поиск элемента, если нам известен ключ - уникальный идентификатор объекта.
        Все классы отображений реализуют обобщенный интерфейс Map<K, V>, который определяет основную функциональность через следующие методы:
        void clear(): очищает коллекцию
        boolean containsKey(Object k): возвращает true, если коллекция содержит ключ k
        boolean containsValue(Object v): возвращает true, если коллекция содержит значение v
        Set<Map.Entry<K, V>> entrySet(): возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry
        boolean equals(Object obj): возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj
        boolean isEmpty: возвращает true, если коллекция пуста
        V get(Object k): возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null
        V put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k, если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null
        Set<K> keySet(): возвращает набор всех ключей отображения
        Collection<V> values(): возвращает набор всех значений отображения
        void putAll(Map<? extends K, ? extends V> map): добавляет в коллекцию все объекты из отображения map
        V remove(Object k): удаляет объект с ключом k
        int size(): возвращает количество элементов коллекции
        Чтобы положить объект в коллекцию, используется метод put, а чтобы получить по ключу - метод get. Реализация интерфейса Map также позволяет получить наборы как ключей, так и значений. А метод entrySet() возвращает набор всех элементов в виде объектов Map.Entry<K, V>.
        Обобщенный интерфейс Map.Entry<K, V> представляет объект с ключом типа K и значением типа V и определяет следующие методы:
        boolean equals(Object obj): возвращает true, если объект obj, представляющий интерфейс Map.Entry, идентичен текущему
        K getKey(): возвращает ключ объекта отображения
        V getValue(): возвращает значение объекта отображения
        Set<K> keySet(): возвращает набор всех ключей отображения
        V setValue(V v): устанавливает для текущего объекта значение v
        int hashCode(): возвращает хеш-код данного объекта
        При переборе объектов отображения мы будем оперировать этими методами для работы с ключами и значениями объектов.
        Классы отображений
        Отображения в Java представлены несколькими классами. Базовым классом для всех отображений является абстрактный класс AbstractMap, который реализует большую часть методов интерфейса Map. Наиболее распространенным классом отображений является HashMap, который реализует интерфейс Map и наследуется от класса AbstractMap **/
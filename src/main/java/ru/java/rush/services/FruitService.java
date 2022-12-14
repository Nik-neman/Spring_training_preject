package ru.java.rush.services;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import ru.java.rush.entities.FruitEntity;
import ru.java.rush.entities.ProviderEntity;
import ru.java.rush.repositories.FruitRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;  //final переменная репозитория

    //создали публичный метод (название любое может быть)
//на вход принимает сущность и сохраняет ее в базу
    public void save(FruitEntity fruitEntity){
        fruitRepository.save(fruitEntity); //реализовали метод внедренного бина
    }

    public void saveAll(List<FruitEntity> fruitEntities){
        for (FruitEntity fe: fruitEntities) {
            fruitRepository.save(fe); //реализовали метод внедренного бина
        }
    }

    //возвращает лист всех сущностей из базы
    public List<FruitEntity> getAll(){
        return fruitRepository.findAll(); //реализовали метод внедренного бина
    }

}

[challenge](https://web.dio.me/lab/abstraindo-um-bootcamp-usando-orientacao-objetos-em-java/learning/8afcd659-978c-477c-93db-846b83c2927e?back=/track/coding-the-future-claro-java-spring-boot)

[The repository of Camila](https://github.com/cami-la/desafio-poo-dio/tree/master/src/br/com/dio/desafio/dominio).

As I already did all the things of the videos, I will try to explain the concepts and how a particular concept is used:


# Abstraction

To make the modeling of a particular class, Dev (developer) as example, we need to use abstraction. In the real world the Dev is a person, but we needed to concentrate in the main characteristics to build the system and ignore the other ones. As example, in the real world one Dev can eat, but it is not important to us. To us was important that one dev can 'progredir' (progress) in a Bootcamp.


# Encapsulation

In the Curso (course) class for example, we don't have access to the cargaHoraria property. But we can change and retrieve the value with the methods getCargaHoraria() and setCargaHoraria().


# Inheritance

The Curso (course) class and Mentoria (mentoring) class inherits from Conteudo (content).


# Polymorphism

As example see this line in the `Dev` class of the package `br.com.dio.desafio.dominio`:

```
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }
```

`Conteudo` is a generic abstract class. But `Curso` (course) and `Mentoria`(mentoring) classes inherits from `Conteudo`. This way, as we wanna a `Curso` or a `Mentoria` class in the set, we can set the type `Conteudo` inside the "generics" identifier (<>). This is polymorphism.
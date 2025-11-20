public class Skeleton extends Enemy{

    Skeleton(){
        super(1,30,"Papyrus");
    }

    @Override
    public void update(){
        System.out.println(name + " stares happily but hauntingly into your soul");
    }

    @Override
    public void attack(){
        System.out.println(name + " begins to shake, dance scarcely as his bones rattle");
    }
}

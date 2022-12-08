package AbstractFactory;

class IranianGardenCreator implements AbstractGardenCreator
{
    @Override
    public AbstractTree CreateTree()
    {
        return AbstractTree.Chenar;
    }

    @Override
    public AbstractFlower CreateFlower()
    {
        return AbstractFlower.Khatmi;
    }
}

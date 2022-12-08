package AbstractFactory;

class JapaneseGardenCreator implements AbstractGardenCreator
{
    @Override
    public AbstractTree CreateTree()
    {
        return AbstractTree.J1;
    }

    @Override
    public AbstractFlower CreateFlower()
    {
        return AbstractFlower.G1;
    }
}

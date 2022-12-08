package AbstractFactory;

public class Garden
{
    private AbstractTree Tree;
    private AbstractFlower Flower;

    private IranianGardenCreator _iranianGardenCreator = new IranianGardenCreator();
    private JapaneseGardenCreator _japaneseGardenCreator = new JapaneseGardenCreator();

    public Garden(AbstractGarden abstractGarden)
    {
        switch (abstractGarden)
        {
            case Iranian:
                Tree = _iranianGardenCreator.CreateTree();
                Flower = _iranianGardenCreator.CreateFlower();
                break;
            case Japanese:
                Tree = _japaneseGardenCreator.CreateTree();
                Flower = _japaneseGardenCreator.CreateFlower();
                break;
        }
    }

    public AbstractTree getTree()
    {
        return Tree;
    }

    public AbstractFlower getFlower()
    {
        return Flower;
    }
}

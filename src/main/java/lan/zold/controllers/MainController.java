package lan.zold.controllers;

import lan.zold.models.Writefile;

public class MainController {
    public MainController() {
        Writefile wf = new Writefile();
        wf.writeNums();
    }
}

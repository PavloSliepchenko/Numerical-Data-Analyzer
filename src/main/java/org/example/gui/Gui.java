package org.example.gui;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;

public class Gui {
    public String getFilePath() {
        String path = null;
        JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("Text files"
                , "txt");
        chooser.addChoosableFileFilter(extFilter);
        chooser.setDialogTitle("Choose a text file");
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            path = chooser.getSelectedFile().getAbsolutePath();
        } else {
            System.exit(0);
        }
        return path;
    }
}

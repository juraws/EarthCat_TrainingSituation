

package com.company;

import java.io.*;

public class Main {
    static FileWriter fw;
    static BufferedWriter bufw;
    private String line;

    public static void fileOutput(File dir) throws IOException {

        FileReader fr = new FileReader(dir.toString());
        BufferedReader bufr = new BufferedReader(fr);

        String line = null;
        while ((line = bufr.readLine()) != null) {
            if ((line.length() > 0) && (line.charAt(0) == '#')) bufw.write("##");
            if (line.contains("details")) break;
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }


        bufr.close();
    }

    public static void visitAllDirsAndFiles(File dir, int num) throws IOException {
        String pre = "";
        for (int i = 0; i < num; ++i) pre = pre + "#";
        String s = dir.toString();
        s = s.substring(s.lastIndexOf('\\') + 1);
        String suff = s.substring(s.lastIndexOf(".") + 1);
        if (suff.equals("png") || suff.equals("jpg")) return;
        boolean f = false;
        if (s.indexOf('.') > 0) {
            s = s.substring(0, s.indexOf('.'));
            f = true;
        }

//        System.out.print(pre);
//        System.out.println(s);
        bufw.write(pre + " ");
        bufw.write(s + "\n");
        bufw.newLine();
        bufw.flush();
        if (!dir.isDirectory() && f) fileOutput(dir);

        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                visitAllDirsAndFiles(new File(dir, children[i]), num + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        fw = new FileWriter("C:\\Users\\61049\\Desktop\\earthcat\\docs\\SummarySheet.md");
        bufw = new BufferedWriter(fw);

        bufw.write("# summary");
        bufw.newLine();
        bufw.flush();

        File dir = new File("C:\\Users\\61049\\Desktop\\earthcat\\docs\\onsite.md");
        visitAllDirsAndFiles(dir, 1);

        dir = new File("C:\\Users\\61049\\Desktop\\earthcat\\docs\\OtherTrainings");
        visitAllDirsAndFiles(dir, 1);

//        dir = new File("C:\\Users\\61049\\Desktop\\earthcat\\docs\\2021Summer");
//        visitAllDirsAndFiles(dir, 1);

        bufw.close();
    }
}

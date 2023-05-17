
    import java.io.*;
    import java.util.ArrayList;
    import java.util.Scanner;
    import java.net.URL;


    public class FinalCode {
        public static void main(String[] args) throws Exception {

            URL url = new URL("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));



            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {

            }

            in.close();




            URL url2 = new URL("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");




            String modifiedContent = content.toString().replace("<[^]+>","")
                    .replaceAll("&[^;]+;","")
                    .replaceAll("<br>","")
                    .replaceAll("<b>","")
                    .replaceAll("</b>","")
                    .replaceAll("<i>","")
                    .replaceAll("</i>","")
                    .replaceAll("<u>","")
                    .replaceAll("</u>","")
                    .replaceAll("\"","")
                    .replaceAll("<.*?>","")
                    .replaceAll("=","")
                    .replaceAll(",","")
                    .replaceAll("\\[|\\]","")
                    .replaceAll("\"","")
                    .replaceAll(",","")
                    .replace("</syle>","")
                    .replaceAll("}","")
                    .replaceAll("<.*?>","")


                    .replaceAll("\\.","");


            System.out.println(modifiedContent);



            InputStream inputStream = url.openStream();
            Scanner urlInput = new Scanner(inputStream);

            ArrayList<String> words = new ArrayList<>();
            ArrayList<Integer> count = new ArrayList<>();

            int start1 = 235;
            int output1 = 0;


            while (urlInput.hasNext() && output1 < start1 + count.size()) {
                String nextWord = urlInput.next().toLowerCase();
                if (words.contains(nextWord)) {
                    int index = words.indexOf(nextWord);
                    count.set(index, count.get(index) + 1);
                } else {
                    words.add(nextWord);
                    count.add(1);
                }
            }

                urlInput.close();
                inputStream.close();


             //  if(output1 >= start1 ){
                 //   System.out.println(words.get(output1) + " occurred " + count.get(output1)+ "times");



                for (int i = start1; i< words.size() && i < start1 + 20; i++){

                System.out.println(words.get(i) + " occurred " + count.get(i) + " times ");

            }


               //output1++;







            //   if(output >= start + 20){
               //    break;
              // }

          //  urlInput.close();
          //  inputStream.close();

          //  for (int i = 0; i < words.size(); i++) {
              //  System.out.println(words.get(i) + " occurred " + count.get(i) + " times");
            }


        //    urlInput.close();
         //   inputStream.close();

        }









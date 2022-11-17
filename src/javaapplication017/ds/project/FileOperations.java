/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication017.ds.project;
import java.util.*;
/**
 *
 * @author khalil
 */

public class FileOperations {
    AlertBoxes ab=new AlertBoxes();
    
    boolean isTrue= false;
    public boolean LoginFileRead(String user,String pass,String fileName){
        try{
        Scanner scan=new Scanner(new File(fileName));
        while(scan.hasNext()){
        String tempUser=user;
         String tempPass=pass;
         String checkUser=scan.next();
         String checkPass=scan.next();
         if(tempUser.equals(checkUser)&&tempPass.equals(checkPass)){
         isTrue=true;
         }
         
        
        }
        scan.close;
                
                }
        catch(FileNotFoundException e){
            Alert errorAlert=new Alert(AlertType.ERROR);
            errorAlert.setTitle("An Error Occured!");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("error!");
            errorAlert.ShowAndWait();
        }
        return isTrue;
        
    }
    
    public void FileWrite(String[] carBrandStr, String[]carModelStr, String[]carCategoryStr, String[]carYearStr,String[]carPriceStr){
        
        try{
            FileWriter fw= new FileWriter(new File(FileName),append);
            BufferedWriter bw= new BufferedWriter(fw);
            for(int i=0;i<carBrandStr.length;i++){
                bw.write(carBrandStr[i]+","+carModelStr[i]+","+carCategoryStr[i]+","+carYearStr[i]+","+carPriceStr[i]+"\n");
                
            }
            bw.close();
        }
        catch(IOException e){
            Alert errorAlert=new Alert(AlertType.ERROR);
            errorAlert.seTitle("Error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("error!");
            errorAlert.ShowAndWait();
        }
    }
    
    public void FeedBackFileWrite(String[] feedback,String FileName,boolean append){
        try{
            FileWriter fw=new FileWriter(new File(FileName),append)
                BufferedWriter bw=new BufferedWriter(fw);
                for(int i=0;i< feedback.length;i++){
                bw.write(feedback[i]+ "\n");
            }
                bw.close();
            }
                 catch(IOException e){
            Alert errorAlert=new Alert(AlertType.ERROR);
            errorAlert.seTitle("Error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("error!");
            errorAlert.ShowAndWait();    
                    
        }
    }
    
    public void DeleteDuplicateData(String FileName){
        try{
            String input=null;
            File tempFile= new File(FileName);
            Scanner sc=new Scanner(tempFile);
            FileWriter fw=new FileWriter(inputFile, false);
            Set<String> set= new HashSet<String>();
            while(sc.hasNextLine()){
                input= sc.nextLine();
                if(set.add(input)){
                    fw.append(input + "\n");
                }
            }
            fw.flush();
            sc.close();
            fw.close();
        }
        catch(Exception e){
            Alert errorAlert=new Alert(AlertType.ERROR);
            errorAlert.seTitle("Error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("error!");
            errorAlert.ShowAndWait();
            e.printStackTrace();
            
        }
    }
    public void ArrayToQueue(Queue<String>carBrandQueue,Queue<String> carModelQueue,Queue<String> carCategoryQueue){
    
    try{
        ArrayList<String> brand=new ArrayList<>();
        ArrayList<String> model=new ArrayList<>();
        ArrayList<String> category= new ArrayList<>();
        ArrayList<String> year=new ArrayList<>();
        ArrayList<String> price=new ArrayList<>();
        List<String>tempData=Files.readALLLines(Path.get(FileName));
        for(String line : tempData){
        String[] fields=line.split(",");
        brand.add(fields[0]);
        model.add(fields[1]);
        category.add(fields[2]);
        year.add(fields[3]);
        price.add(fields[4]);
        
        }
        carBrandQueue.addAll(brand);
        carModelQueue.addAll(model);
        carCategoryQueue.addAll(category);
        carYearQueue.addAll(year);
        carPriceQueue.addAll(price);
    }
    catch(Exception e){
    ab.ErrorAlert();}
    
    }
    public void FileUpdate(ArrayList<String> carBrandAL,ArrayList<String> carModelAL,ArrayList<String> carCategoryAL){
    try{
        FileWriter fw=new FileWriter(new File(FileName),append);
        BufferedfWriter bw = new BufferedWriter(new File(FileName),append);
        for(int i=0;i<carBrandAL.size();i++){
        bw.write(carBrandAL.get(i)+ ","+carModelAL.get(i)+ "," + carCategoryAL.get(i));
        
    }
    bw.close();
    
    }
    catch(IOException e)
    {
    Alert errorAlert=new Alert(AlertType.ERROR);
    errorAlert.setTitle("An Error Occured!");
    errorAlert.setHeaderText(null);
    errorAlert.setContentText("Oops!An error occured. Sorry for your inconvience.");
    errorAlert.showAndwait();
    }
    
    
    
    }
    
    }
    

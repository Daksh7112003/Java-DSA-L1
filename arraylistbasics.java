 ArrayList<Integer> list= new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    System.out.println(list+"->"+list.size());
    for(int val:list){                  //the way of printing arraylist by using the new type of loop ........
        System.out.println(val);
    }

    for(int i= 0; i<list.size();i++){
        int val=list.get(i);               //other way of printng the arraylist......
        System.out.println(val);

    }

    list.set(2,300); // replacing the element of the arraylist/.......
    System.out.println(list+"->"+list.size());
    list.add(3,300000);
    System.out.println(list+"->"+list.size());



    





 





}
    
}

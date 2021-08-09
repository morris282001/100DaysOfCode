public static int size(Node node){
      int size=0;
      for(Node child: node.children)
      {
          int cs= size(child);
          size= size+ cs;
      }
      return size+1;
  }

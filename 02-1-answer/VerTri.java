public class VerTri {
    private int height;
    private int type;
    private String ch="*";
    
    private final int UpLeft = 1;
    private final int UpRight = 2;
    private final int DownLeft = 3;
    private final int DownRight = 4;
    
    public VerTri(int height,int type){
        this.height=height;
        this.type=type;
    }
    
    public VerTri(int height,int type,String ch){
        this.height=height;
        this.type=type;
        this.ch=ch;
    }
    
    public VerTri() {
		
	}

	void draw() {
        switch(type){
            case UpLeft:
                for(int i=1;i<=height;i++){
                    prchar(ch,i);
                    System.out.printf("\n");
                }
                break;
            case UpRight:
                for(int i=1;i<=height;i++){
                    prchar(" ", height-i+1);
                    prchar(ch,i);
                    System.out.printf("\n");
                }
                break;
            case DownLeft:
                for(int i=1;i<=height;i++){
                    prchar(ch,height-i+1);
                    System.out.printf("\n");
                }
                break;
            case DownRight:
                for(int i=1;i<=height;i++){
                    prchar(" ", i-1);
                    prchar(ch,height-i+1);
                    System.out.printf("\n");
                }
                break;
        }

    }

    @Override
	public String toString() {
		return "VerTri: height=" + height + "; type=" + type + "; ch=" + ch;
	}

	void prchar(String c, int n){
        for(int i=1;i<=n;i++)
            System.out.printf("%s", c);
    }

	public void setHeight(int height) {
		this.height=height;
	}

	public void setType(int type) {
		this.type=type;
	}

	public void setCh(String ch) {
		this.ch=ch;
	}

	public int getHeight() {
		return height;
	}

	public int getType() {
		return type;
	}

	public String getCh() {
		return ch;
	}
}
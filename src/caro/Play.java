
package caro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Play extends javax.swing.JFrame{
    
    public Play(String nameP1,String nameP2,int size, int width,int score1,int score2,int timeLimit, boolean com, Start start) {
        initComponents();
        XY+=width;
        this.setTitle("cờ caro ");
        this.n1=nameP1;this.n2=nameP2;
        this.currentScore1=score1; this.currentScore2=score2;
        player1.setText(n1);
        player2.setText(n2);
        labelScore1.setText(currentScore1.toString());
        labelScore2.setText(currentScore2.toString());
        player = false;
        this.Width=width;
        this.Size= size;
        this.com=com;
        
        stopwatch = new Stopwatch(timeLabel,timeLimit,this);
        stopwatch.setTimeLimit(timeLimit);
        this.start=start.getModelStart();
        nguoichoi.setText(n1);
        labelXO.setIcon(red);
        stopwatch.setInfoPlayer(n2,Color.BLUE);
        drawCoorBoard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelScore2 = new javax.swing.JLabel();
        labelScore1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        turn = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        banco = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                this.setOpaque(false);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Vẽ bàn cờ

                g.setColor(new java.awt.Color(59,58,48));
                for(int r = 0;r<=Size;r++){
                    g.drawLine(XY, XY+r*Width, XY+Size*Width, XY+r*Width);
                }
                for(int c = 0;c<=Size;c++){
                    g.drawLine(XY+c*Width, XY, XY+c*Width, XY+Size*Width);
                }
                if(player)
                g.setColor(Color.BLUE);
                else g.setColor(Color.RED);
                g.drawRect(XY+(move.x)*Width,XY+(move.y)*Width, Width+1, Width+1);
                g.drawRect(XY+(move.x)*Width,XY+(move.y)*Width, Width, Width);
                Integer intTurn=Board.size();
                turn.setText(intTurn.toString());
                //Vẽ các vị trí đã đánh
                if(Board.size()==0) return;
                for(int p = 0;p<Board.size();p++){
                    if(player){
                        if(p%2!=0) {g2.setColor(Color.BLUE);labelXO.setIcon(red);nguoichoi.setForeground(Color.RED);nguoichoi.setText(n1);}
                        else{ g2.setColor(Color.RED);labelXO.setIcon(blue);nguoichoi.setForeground(Color.BLUE);nguoichoi.setText(n2);}
                    }else{
                        if(p%2==0){ g2.setColor(Color.RED);nguoichoi.setForeground(Color.BLUE);labelXO.setIcon(blue);nguoichoi.setText(n2);}
                        else{ g2.setColor(Color.BLUE);nguoichoi.setForeground(Color.RED);labelXO.setIcon(red);nguoichoi.setText(n1);}
                    }
                    g2.fillOval(XY+ Board.get(p).x*Width+Width/6+1,XY+Board.get(p).y*Width+Width/6+1, 2*Width/3, 2*Width/3);
                }
                //Đánh dấu ô mới đánh
                g.setColor(Color.black);
                g.drawRect(Board.get(Board.size()-1).x*Width+XY, Board.get(Board.size()-1).y*Width+XY, Width, Width);
                super.paintComponent(g);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        labelXO = new javax.swing.JLabel();
        nguoichoi = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        back = new javax.swing.JButton();
        homepage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(178, 194, 191));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        player1.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 0, 0));
        player1.setText("player1");

        jLabel4.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("lượt");

        labelScore2.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        labelScore2.setForeground(new java.awt.Color(0, 0, 204));
        labelScore2.setText("0");
        labelScore2.setToolTipText("");

        labelScore1.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        labelScore1.setForeground(new java.awt.Color(255, 0, 0));
        labelScore1.setText("0");

        player2.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(0, 0, 204));
        player2.setText("player2");

        turn.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        turn.setForeground(new java.awt.Color(51, 51, 51));
        turn.setText("0");

        timeLabel.setFont(new java.awt.Font("UVN Bach Dang Nang", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setText("timeLabel");

        banco.setBackground(new java.awt.Color(102, 102, 102));
        banco.setForeground(new java.awt.Color(255, 0, 0));
        banco.setPreferredSize(new java.awt.Dimension(580, 580));
        banco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bancoMouseMoved(evt);
            }
        });
        banco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bancoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bancoLayout = new javax.swing.GroupLayout(banco);
        banco.setLayout(bancoLayout);
        bancoLayout.setHorizontalGroup(
            bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        bancoLayout.setVerticalGroup(
            bancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelXO.setBackground(new java.awt.Color(255, 255, 204));

        nguoichoi.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 18)); // NOI18N
        nguoichoi.setForeground(new java.awt.Color(255, 0, 0));

        exit.setBackground(new java.awt.Color(189, 87, 52));
        exit.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Thoát");
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.setPreferredSize(new java.awt.Dimension(105, 40));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(59, 58, 48));
        restart.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 14)); // NOI18N
        restart.setForeground(new java.awt.Color(255, 255, 255));
        restart.setText("Ván mới");
        restart.setFocusPainted(false);
        restart.setFocusable(false);
        restart.setPreferredSize(new java.awt.Dimension(105, 40));
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        pause.setBackground(new java.awt.Color(59, 58, 48));
        pause.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 14)); // NOI18N
        pause.setForeground(new java.awt.Color(255, 255, 255));
        pause.setText("Dừng");
        pause.setFocusPainted(false);
        pause.setFocusable(false);
        pause.setPreferredSize(new java.awt.Dimension(105, 40));
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(59, 58, 48));
        back.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Đi lại");
        back.setFocusPainted(false);
        back.setFocusable(false);
        back.setPreferredSize(new java.awt.Dimension(105, 40));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        homepage.setBackground(new java.awt.Color(59, 58, 48));
        homepage.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 14)); // NOI18N
        homepage.setForeground(new java.awt.Color(255, 255, 255));
        homepage.setText("Trang chủ");
        homepage.setFocusPainted(false);
        homepage.setFocusable(false);
        homepage.setPreferredSize(new java.awt.Dimension(105, 40));
        homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepageActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caro/anh/CCR-1.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("UVN Bach Dang Nang", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Người chơi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nguoichoi, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(homepage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nguoichoi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelXO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(homepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(banco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(banco, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeLabel)
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(turn)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(player2)
                        .addComponent(labelScore2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(player1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelScore1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void drawCoorBoard(){
       JLabel[] r= new JLabel[Size];
       JLabel[] c= new JLabel[Size];
        for(Integer i = 0;i<Size;i++){
            r[i] = new JLabel(i.toString());
            r[i].setFont(new java.awt.Font("UVN Bach Dang Nang",Font.PLAIN,18));
            r[i].setBounds((i+1)*Width,0,Width,Width);
            r[i].setHorizontalAlignment(0);
            r[i].setVerticalAlignment(0);
            c[i] = new JLabel(i.toString());
            c[i].setFont(new java.awt.Font("UVN Bach Dang Nang",Font.PLAIN,18));
            c[i].setBounds(0,(i+1)*Width,Width,Width);
            c[i].setHorizontalAlignment(0);
            c[i].setVerticalAlignment(0);
            banco.add(r[i]);
            banco.add(c[i]);
        } 
    }

    

    static final int horizontal =0;
    static final int vertical=1;
    static final int diagonalLeftToRight=2;
    static final int diagonalRightToLeft=3;
    static final int blocked=6;
    static final int numberOfDirection=4;
 
       
    /*AI*/   
    public boolean isInBoard(Point p){
        return p.x>=0 && p.x<Size && p.y>=0 && p.y<Size;
    } 
    public Point march(Point p, int direction_x, int direction_y ,int length){
        /*
    tìm vị trí xa nhất theo chiều direction trong khoảng cách 4 ô từ vị trí ô đang xét
    */
        Point farthestPoint;
        for(int numberOfOco=length;numberOfOco>=0;numberOfOco--){
                farthestPoint= new Point(p.x+direction_x*numberOfOco,p.y+direction_y*numberOfOco);
            if(isInBoard(farthestPoint)){
                return farthestPoint;
            }
        }
        return p;
    }
    static int countCell(Point a, Point b){
        int numOfCell_x=Math.abs(a.x-b.x)+1;
        int numOfCell_y=Math.abs(a.y-b.y)+1;
        int numOfCell=(numOfCell_x>=numOfCell_y)?numOfCell_x:numOfCell_y;
        return numOfCell;
    }
    public Boolean yourChess(Point check, int player){
        return Board.contains(check) && Board.indexOf(check)%2==player;
    }
    public Boolean isEmptyCell(Point check){
        return !Board.contains(check);
    }
    public ArrayList<Integer> getArrayDirection(Point current,Point farthestPoint_Left ,Point direction, Point farthestPoint_Right,int player){
        /*
        trả về một list với mỗi phần tử đại diện cho số điểm của 5 ô cờ
        */
        ArrayList<Integer> colscores = new ArrayList<>(Collections.nCopies(5, 0));
        int numOfCell=countCell(farthestPoint_Left,farthestPoint_Right);
        int numOfArray=numOfCell-4;
        int lengthArray=5;
        Point firstCellOfArray=new Point(farthestPoint_Left);
        int dem=0;
        int x_lastCell = farthestPoint_Left.x + lengthArray*direction.x;
        int y_lastCell = farthestPoint_Left.y + lengthArray*direction.y;
        Point lastCellOfArray=new Point(x_lastCell,y_lastCell);
        for(int arrayIndex=1;arrayIndex<=numOfArray;arrayIndex++){
            Point cellCheck= new Point(firstCellOfArray);
            int countChess=0;
            while(!cellCheck.equals(lastCellOfArray)){    
                if (cellCheck.equals(current) || yourChess(cellCheck,player))
                    countChess++;
                else if(!isEmptyCell(cellCheck)){
                    countChess=blocked;
                    break;
                }
                //WTF
                cellCheck.translate(direction.x, direction.y);
            }
            colscores.set(dem,countChess);
            dem++;
            lastCellOfArray.translate(direction.x,direction.y);
            firstCellOfArray.translate(direction.x,direction.y);
        }
        return colscores;
    }
    /* tấn công*/
    //duyệt ngang
    public ArrayList<ArrayList<Integer>> getArrayChess(Point p,int player){
        /* 
        trả về mảng vs mỗi 1 phần tử arrayList được đánh số là số quân cờ
        và 1 arrayList<Integer> là 1 danh sách lưu số lần xuất hiện số quân cờ đó theo từng phương
        */
        Point []directions = new Point[4];
        directions[horizontal]= new Point(1,0);
        directions[vertical] = new Point(0,1);
        directions[diagonalLeftToRight]= new Point(1,1);
        directions[diagonalRightToLeft]= new Point(1,-1);
        ArrayList<ArrayList<Integer> > arrayDirections;
       // System.out.print("\n p:"+p+"\n");
        arrayDirections=new ArrayList< >(numberOfDirection);
        Point farthestPoint_Left = new Point();
        Point farthestPoint_Right = new Point();
        for (int selectedDir=horizontal;selectedDir<=diagonalRightToLeft;selectedDir++){            
            farthestPoint_Left=march(p,-directions[selectedDir].x,-directions[selectedDir].y,4);
            farthestPoint_Right=march(p,directions[selectedDir].x,directions[selectedDir].y,4);
            arrayDirections.add(getArrayDirection(p,farthestPoint_Left,directions[selectedDir],farthestPoint_Right,player));
        } 
        ArrayList<ArrayList<Integer> > arrayChess; 
        arrayChess=new ArrayList< >();
        for (int numChess=0; numChess<=6;numChess++){
            int indexDir=horizontal;
            Integer[] numOccurrences_numChess={0,0,0,0};
            for (ArrayList<Integer> selectedDir : arrayDirections){            
                for (Object soQuanCo : selectedDir){
                    if(soQuanCo.equals(numChess)){
                            numOccurrences_numChess[indexDir]++;     
                        }
                }
                    indexDir++;
            }
            ArrayList<Integer> array_numChess = new ArrayList<>();
            for (int i =0;i<4;i++){
                
                array_numChess.add(numOccurrences_numChess[i]);
            }
            arrayChess.add(array_numChess);
        }
        return arrayChess;
    }
   
 
    public ArrayList<Point> possibleMoves(){
        /*
           trả về 1 List chứ các vị trí đi mà có thể đem lại thế cho com
        */
        
        // mảng directions lưu hướng đi(8 hướng)
        ArrayList <Point> directions = new ArrayList<>();
        for (int i =-1;i<=1;i++){
            for(int j=1; j>=-1;j--){
                if(i==0 && j==0)
                    continue;
                Point tmp = new Point(i,j);
                directions.add(tmp);
            }
        }
       
        // lưu giá trị đánh
        ArrayList <Point> cord = new ArrayList <>();
        for (Point direction : directions){
            for(Point coord : Board){
                for(int i = 1;i<=4;i++){
                    Point move = march(coord,direction.x,direction.y,i);
                    if (!Board.contains(move) && !cord.contains(move)){
                        cord.add(move);
                    }
                }
            }
        }

        return cord;
    }
    static boolean TF34score(ArrayList<Integer> score3,ArrayList<Integer> score4){
        for (int key4=0;key4<score4.size();key4++){
            if (score4.get(key4)>=1){
                for (int key3=0; key3 <score3.size();key3++){
                    if(key3!=key4 && score3.get(key3)>=2)
                        return true;
                }
            }
        }
        return false;
    }
    static int countDirection_Chess(ArrayList<Integer> arrayChess){
      //đếm số phương có quân cờ của mảng 
        int count=0;
        for (Integer arrayIndex : arrayChess){
            if(arrayIndex>0)
                count++;
        }
        return count;
    }
    public int winning_situation(ArrayList<ArrayList<Integer>> sumcol){
        /*
        trả lại tình huống chiến thắng dạng như:
        {0: {}, 1: {(0, 1): 4, (-1, 1): 3, (1, 0): 4, (1, 1): 4}, 2: {}, 3: {}, 4: {}, 5: {}, -1: {}}
        1-5 lưu điểm có độ nguy hiểm từ thấp đến cao,
        6 là rơi vào trạng thái tồi, cần phòng thủ
        */
        ArrayList<Integer> sort4 = new ArrayList<>();
        sort4.addAll(sumcol.get(4));
        sort4.sort((o1,o2)->o2 - o1);
        if (sumcol.get(5).contains(1))
            return 5;
        
        else if (countDirection_Chess(sumcol.get(4))>=2 || (countDirection_Chess(sumcol.get(4))>=1 && sort4.get(0)>=2))
            return 4;
        else if (TF34score(sumcol.get(3),sumcol.get(4)))
            return 4;
        else{
            ArrayList<Integer> sort3 = new ArrayList<>();
            sort3.addAll(sumcol.get(3));
            sort3.sort((o1,o2)->o2 - o1);
            if (countDirection_Chess(sumcol.get(3))>=2 && sort3.get(0)>=sort3.get(1) && sort3.get(1)>=2)
                return 3;
        }
        return 0;
    }
    public ArrayList<Integer> sum_sumcol_values(ArrayList<ArrayList<Integer>> sumcol){
        /*
        Hợp nhất điểm của mỗi sô quân cờ xuất hiện
        */
        ArrayList<Integer> sum = new ArrayList<>();
        
        for(ArrayList<Integer> key : sumcol){
            int tmp=0;
            for(Integer giatri : key){
                tmp+=giatri;
            }
            sum.add(tmp);
        }
        return sum;
    }
    
    public int advantage_Score(Point p, int player){
        /*
        Cố gắng di chuyển x,y
        trả về điểm số tượng trưng lợi thế
        khi tỉnh táo cần chỉnh sửa
        */
        int antiUser=0;
        int atk=0,res=0,def=0;
        //tấn công
        Board.add(p);
        ArrayList <ArrayList<Integer>> arrayChess= new ArrayList<>();
        arrayChess.addAll(getArrayChess(p,player));
        ArrayList<Integer> sum_NumChess= new ArrayList<>();
        sum_NumChess.addAll(sum_sumcol_values(arrayChess));
        atk+=sum_NumChess.get(1)+4*sum_NumChess.get(2)+8*sum_NumChess.get(3)+16*sum_NumChess.get(4)+sum_NumChess.get(6);
        int adv= winning_situation(arrayChess);
        atk+= adv*1000;
        //phong thu
        arrayChess.removeAll(arrayChess);
        arrayChess.addAll(getArrayChess(p,antiUser));
        sum_NumChess.removeAll(sum_NumChess);
        sum_NumChess.addAll(sum_sumcol_values(arrayChess));
        def+=sum_NumChess.get(1)+4*sum_NumChess.get(2)+8*sum_NumChess.get(3)+16*sum_NumChess.get(4)+sum_NumChess.get(6);
        adv= winning_situation(arrayChess);
        def+=adv*900;
        res=atk+def;
        Board.remove(p);
        return res;
        
    }
    public Point best_move(int player){
        Point willmove = new Point(0,0);
        int currentScore=0;
        int maxscore = 0;
        ArrayList<Point> moves= new ArrayList<>();
        moves.addAll(possibleMoves());
        for(Point move : moves){
            currentScore=advantage_Score(move,player);
            if (currentScore>maxscore){
                maxscore=currentScore;
                willmove=new Point(move);
            }
        }
        return willmove;
    }
    public void mayDanh() {
        int com = 1;
        Point oco= new Point(best_move(com));    
        Board.add(oco);  
        chess=new Point(oco);
        banco.repaint();
        isWin(player);
        player=!player;
    }
    /*--------------------------------*/
     public void resetTimeLimit(boolean iscom){
        stopwatch.reset(timeLabel,iscom);
        stopwatch.timer.start();
    }
    public boolean getPlayer(){
        return player;
    }
    public void click(){
        
        if (stopwatch.elapsedTime==0){
            checkWin(player);
            return;
        }
        else {
            Point p;
            //Kiểm tra vị trí có thuộc bàn cờ không?
            if (isInBoard(new Point(cot,dong)))  p = new Point(cot, dong);      
             else   return;

            if (isEmptyCell(p)) {
                Board.add(p);
               
                
    //            count++;
                chess = new Point(p);
                cot = -1;
                dong = -1;
                banco.repaint();
                if(!isWin(player)){
                    player=!player;
                    if (com){
                        if(stopwatch.getTimeLimit()==-1){
                            mayDanh();
                            
                        }
                        resetTimeLimit(true);                                            
                    }
                    else{
                        resetTimeLimit(false);
                    }
                }
            }
        }
         
    }
    private void bancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancoMouseClicked
        // game tạm dừng
        if (isPause != true ) {   
            return;
        }
        // tới lượt máy, người chơi không được đánh
        if(com && player){
            return;
        }
        click();
    }//GEN-LAST:event_bancoMouseClicked
    public void checkCoordinates(int CX,int CY){
        if (CY - Size < 0) {
                cot = (CX - XY) / Width;
                dong = -1 + (CY - XY) / Width;
                return;
            }
            if (CX - Size < 0) {
                cot = -1 + (CX - XY) / Width;
                dong = (CY - XY) / Width;
                return;
            }
            cot = (CX - XY) / Width;
            dong = (CY - XY) / Width;
            Point p = new Point(cot, dong);
            if (!isEmptyCell(p)) {
                cot = -1;
                dong = -1;
            }
    }
    private void bancoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bancoMouseMoved
        if(stopwatch.elapsedTime==0){
            pauseAfterWin(!player,true);     
        }
            int CX = evt.getX();
            int CY = evt.getY();
            checkCoordinates(CX,CY);
         
//        banco.repaint();
//        banco.validate();
    }//GEN-LAST:event_bancoMouseMoved

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       if(isPause!=true)
           return;
       if (Board.isEmpty()) {
            return;
        }
        player = !player;
        Board.remove( Board.size() -1);
       
        if (com){
            Board.remove(Board.size()-1);
           
        }
        if(!player){
             labelXO.setIcon(red);
             nguoichoi.setText(n1);
        }else{
           labelXO.setIcon(blue);
            nguoichoi.setText(n2); 
        }       
        banco.repaint();
    }//GEN-LAST:event_backActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
       isPause = !isPause;
       if (!isPause){
       stopwatch.stop();
       pause.setBackground(new java.awt.Color(189,87,52));
       }
       else{
           pause.setBackground(new java.awt.Color(51,51,51));
           stopwatch.timer.start();
       }
    }//GEN-LAST:event_pauseActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
       new Play(n1,n2,Size,Width,Integer.parseInt(labelScore1.getText()),Integer.parseInt(labelScore2.getText()),stopwatch.getTimeLimit(),com,start).setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_restartActionPerformed

    private void homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepageActionPerformed
       this.dispose();
       stopwatch.stop();
       start.setVisible(true);
      
    }//GEN-LAST:event_homepageActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        if(stopwatch.elapsedTime==0){
            pauseAfterWin(!player,true);     
        }
      }//GEN-LAST:event_jPanel2MouseMoved

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
//đánh bằng phím
        if(!player){
            switch(evt.getKeyCode()){
                case 119: case 87:move.y--; break;
                case 115: case 83:move.y++; break;
                case 97:  case 65:move.x--; break;
                case 100: case 68:move.x++; break;
                case 32:
                    if(!Board.contains(move)){
                        cot=move.x;
                        dong=move.y;    
                        click();
                    }
                    break;
            }
        }
        else{
            switch(evt.getKeyCode()){
                case 38:move.y--; break;
                case 40:move.y++; break;
                case 37:move.x--; break;
                case 39:move.x++; break;
                case 10:
                    if(!Board.contains(move)){
                        cot=move.x;
                        dong=move.y;
                        click();
                    }
                    break;
            }
        }
        
        banco.repaint();
        
    }//GEN-LAST:event_formKeyPressed
    public boolean checkWin(boolean player){
        // kiểm tra xem người chơi có thắng hay không
        int u =(player)?1:0;
        ArrayList<ArrayList<Integer>> ArrayScorePoint = new ArrayList<>();
        ArrayScorePoint.addAll(getArrayChess(chess,u));
        return ArrayScorePoint.get(5).contains(1);     
    }
    public void pauseAfterWin(boolean user, boolean win){ 
        // thiết lập điểm và cho dừng bàn cờ khi có 1 bên thắng hoặc hoà
        Integer score_temp=0;
        if (win){
           
            if(user){
                if(score_temp<=currentScore2){
                    score_temp=currentScore2+1;                    
                    labelScore2.setText(score_temp.toString());
                }
            }
            else {
                if(score_temp<=currentScore1){
                    score_temp=currentScore1+1;
                    labelScore1.setText(score_temp.toString());
                }
            }
        }
       
        isPause=!isPause;
        pause.setEnabled(false);
        back.setEnabled(false);
        stopwatch.stop();  
    }
    public boolean isWin(boolean user){
        
        // thông báo kết quả chiến thắng của bàn cờ
        String player=new String();
        Color color;
                if(user){
                    player= n2;
                    color = Color.BLUE;
                    stopwatch.setInfoPlayer(player,color);
                    
                }
                else{ 
                    player= n1;  
                    color = Color.red;
                    stopwatch.setInfoPlayer(player,color);
                   
                }          
        if (checkWin(user)) {
            pauseAfterWin(user,true);
            new End(player,true,false,color).setVisible(true);
            
            return true;
                //this.dispose();
            }
        if(Board.size()==Size*Size){
            pauseAfterWin(user,false);     
            new End("Hoà",false,false,Color.BLACK).setVisible(true);
            return true;
        }
        return false;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel banco;
    private javax.swing.JButton exit;
    private javax.swing.JButton homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelScore1;
    private javax.swing.JLabel labelScore2;
    private javax.swing.JLabel labelXO;
    private javax.swing.JLabel nguoichoi;
    private javax.swing.JButton pause;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JButton restart;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel turn;
    // End of variables declaration//GEN-END:variables
    
    private final  ImageIcon red =new ImageIcon(getClass().getResource("anh/playx.png")); 
    private final  ImageIcon blue=new ImageIcon(getClass().getResource("anh/playo.png")); 
    private final String n1,n2;
    private Point move = new Point(0,0);
    private Start start= new Start();
    
    private final Stopwatch stopwatch ;
    private Integer currentScore1,currentScore2;
    private int XY = 5;
    private final int Width;
    private final int Size ;
    private int dong = -1;
    private int cot = -1;
    private Point chess = new Point(); 
    private boolean player;
    private Vector<Point> Board = new Vector<Point>();
    boolean isPause = true;
    private final boolean com;
   
}
package autonoma.SimuladorAutomovil.views;
import autonoma.SimuladorAutomovil.models.Automovil;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * @author DOSSA0110
 * @author CRISTIAN
 * @version 1.0.0
 * @since 2024/03/14
 */
public class PaginaPrincipal extends javax.swing.JFrame {
    private Automovil automovil;
    private boolean estado;
    public PaginaPrincipal(Automovil automovil) {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/CarroIMG.jpg")).getImage());
        } catch (Exception e) {
        }
        
        this.automovil = automovil; // Inicializa el objeto automovil con el que se pasa como argumento
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrincipalPanelBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EncenderCarroBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ApagarCarroBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FrenarCarroBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AcelerarCarroBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        FrenoDeManoBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        PrincipalPanelBtn.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/CarroIMG.jpg"))); // NOI18N

        EncenderCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        EncenderCarroBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        EncenderCarroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncenderCarroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EncenderCarroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EncenderCarroBtnMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/Encender.png"))); // NOI18N

        javax.swing.GroupLayout EncenderCarroBtnLayout = new javax.swing.GroupLayout(EncenderCarroBtn);
        EncenderCarroBtn.setLayout(EncenderCarroBtnLayout);
        EncenderCarroBtnLayout.setHorizontalGroup(
            EncenderCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncenderCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        EncenderCarroBtnLayout.setVerticalGroup(
            EncenderCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncenderCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ApagarCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        ApagarCarroBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        ApagarCarroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarCarroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApagarCarroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApagarCarroBtnMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/Apagar.png"))); // NOI18N

        javax.swing.GroupLayout ApagarCarroBtnLayout = new javax.swing.GroupLayout(ApagarCarroBtn);
        ApagarCarroBtn.setLayout(ApagarCarroBtnLayout);
        ApagarCarroBtnLayout.setHorizontalGroup(
            ApagarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApagarCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ApagarCarroBtnLayout.setVerticalGroup(
            ApagarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApagarCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        FrenarCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        FrenarCarroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrenarCarroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FrenarCarroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FrenarCarroBtnMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/FrenoBTN.png"))); // NOI18N

        javax.swing.GroupLayout FrenarCarroBtnLayout = new javax.swing.GroupLayout(FrenarCarroBtn);
        FrenarCarroBtn.setLayout(FrenarCarroBtnLayout);
        FrenarCarroBtnLayout.setHorizontalGroup(
            FrenarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrenarCarroBtnLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );
        FrenarCarroBtnLayout.setVerticalGroup(
            FrenarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrenarCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        AcelerarCarroBtn.setBackground(new java.awt.Color(0, 0, 0));
        AcelerarCarroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcelerarCarroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AcelerarCarroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcelerarCarroBtnMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/AceleradorBTN.png"))); // NOI18N

        javax.swing.GroupLayout AcelerarCarroBtnLayout = new javax.swing.GroupLayout(AcelerarCarroBtn);
        AcelerarCarroBtn.setLayout(AcelerarCarroBtnLayout);
        AcelerarCarroBtnLayout.setHorizontalGroup(
            AcelerarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcelerarCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        AcelerarCarroBtnLayout.setVerticalGroup(
            AcelerarCarroBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcelerarCarroBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FrenoDeManoBtn.setBackground(new java.awt.Color(0, 0, 0));
        FrenoDeManoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrenoDeManoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FrenoDeManoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FrenoDeManoBtnMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/SimuladorAutomovil/img/FrenoDeManoIMG.png"))); // NOI18N

        javax.swing.GroupLayout FrenoDeManoBtnLayout = new javax.swing.GroupLayout(FrenoDeManoBtn);
        FrenoDeManoBtn.setLayout(FrenoDeManoBtnLayout);
        FrenoDeManoBtnLayout.setHorizontalGroup(
            FrenoDeManoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrenoDeManoBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        FrenoDeManoBtnLayout.setVerticalGroup(
            FrenoDeManoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrenoDeManoBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrincipalPanelBtnLayout = new javax.swing.GroupLayout(PrincipalPanelBtn);
        PrincipalPanelBtn.setLayout(PrincipalPanelBtnLayout);
        PrincipalPanelBtnLayout.setHorizontalGroup(
            PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelBtnLayout.createSequentialGroup()
                .addGroup(PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalPanelBtnLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EncenderCarroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(ApagarCarroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(PrincipalPanelBtnLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(FrenarCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(AcelerarCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(FrenoDeManoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalPanelBtnLayout.setVerticalGroup(
            PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelBtnLayout.createSequentialGroup()
                .addGroup(PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrincipalPanelBtnLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(EncenderCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ApagarCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AcelerarCarroBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FrenoDeManoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FrenarCarroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mouseEntred(JPanel panel){
        panel.setBackground(new Color(51,51,51));
    }
    private void mouseExited(JPanel panel){
        panel.setBackground(new Color(0,0,0));
    }
    private void mouseClicked(JPanel panel){
        panel.setBackground(new Color(102,102,102));
    }
    private void EncenderCarroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderCarroBtnMouseClicked
        this.mouseClicked(EncenderCarroBtn); 
        if (!automovil.getEstado()) {
            automovil.setEstado(true);
            System.out.println("!!El carro esta encendido!!");
            System.out.println("Estado = True");
        } else {
            System.out.println("El carro NO se puede encender de nuevo");
        }
    }//GEN-LAST:event_EncenderCarroBtnMouseClicked

    private void ApagarCarroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarCarroBtnMouseClicked
        this.mouseClicked(ApagarCarroBtn);
        if (automovil.getEstado()) { 
        automovil.setEstado(false); 
            System.out.println("!!El carro esta Apagado!!");
            System.out.println("Estado = False");
        } else {
            System.out.println("El carro NO se puede apagar de nuevo");
        }      
    }//GEN-LAST:event_ApagarCarroBtnMouseClicked

    private void EncenderCarroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderCarroBtnMouseEntered
        this.mouseEntred(EncenderCarroBtn);
    }//GEN-LAST:event_EncenderCarroBtnMouseEntered

    private void EncenderCarroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderCarroBtnMouseExited
        this.mouseExited(EncenderCarroBtn);
    }//GEN-LAST:event_EncenderCarroBtnMouseExited

    private void ApagarCarroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarCarroBtnMouseEntered
        this.mouseEntred(ApagarCarroBtn);
    }//GEN-LAST:event_ApagarCarroBtnMouseEntered

    private void ApagarCarroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarCarroBtnMouseExited
        this.mouseExited(ApagarCarroBtn);
    }//GEN-LAST:event_ApagarCarroBtnMouseExited

    private void FrenarCarroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenarCarroBtnMouseClicked
        this.mouseClicked(FrenarCarroBtn);
        if(automovil.getEstado() == false){
            System.out.println("!!El carro no se puede frenar estando apagado!!");
        }else{
            
            System.out.println("!!Freno - 10 km/h!!");
        }
    }//GEN-LAST:event_FrenarCarroBtnMouseClicked

    private void FrenarCarroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenarCarroBtnMouseEntered
        this.mouseEntred(FrenarCarroBtn);
    }//GEN-LAST:event_FrenarCarroBtnMouseEntered

    private void FrenarCarroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenarCarroBtnMouseExited
        this.mouseExited(FrenarCarroBtn);
    }//GEN-LAST:event_FrenarCarroBtnMouseExited

    private void AcelerarCarroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcelerarCarroBtnMouseClicked
        this.mouseClicked(AcelerarCarroBtn);
        if(automovil.getEstado() == false){
            System.out.println("!!El carro no se puede aclerar estando apagado!!");
        }else{
            
            
            System.out.println("!!Acelero + 10 km/h!!");
        }
    }//GEN-LAST:event_AcelerarCarroBtnMouseClicked

    private void AcelerarCarroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcelerarCarroBtnMouseEntered
        this.mouseEntred(AcelerarCarroBtn);
    }//GEN-LAST:event_AcelerarCarroBtnMouseEntered

    private void AcelerarCarroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcelerarCarroBtnMouseExited
        this.mouseExited(AcelerarCarroBtn);
    }//GEN-LAST:event_AcelerarCarroBtnMouseExited

    private void FrenoDeManoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenoDeManoBtnMouseClicked
        this.mouseClicked(FrenoDeManoBtn);
    }//GEN-LAST:event_FrenoDeManoBtnMouseClicked

    private void FrenoDeManoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenoDeManoBtnMouseEntered
        this.mouseEntred(FrenoDeManoBtn);
    }//GEN-LAST:event_FrenoDeManoBtnMouseEntered

    private void FrenoDeManoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrenoDeManoBtnMouseExited
        this.mouseExited(FrenoDeManoBtn);
    }//GEN-LAST:event_FrenoDeManoBtnMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AcelerarCarroBtn;
    private javax.swing.JPanel ApagarCarroBtn;
    private javax.swing.JPanel EncenderCarroBtn;
    private javax.swing.JPanel FrenarCarroBtn;
    private javax.swing.JPanel FrenoDeManoBtn;
    private javax.swing.JPanel PrincipalPanelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

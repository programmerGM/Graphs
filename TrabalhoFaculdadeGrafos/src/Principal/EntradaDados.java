package Principal;


/**
 * Janela para entrada do Grafo, nesta janela o usuário estará informando as
 * características para realizar a criação do grafo.
 *
 * Estudantes de Ciência da Computação - 4 fase.
 *
 * @author Gustavo Souza
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 * @author Maurício Generoso
 *
 * @since 15/10/2016
 * @version 2.0
 */
public class EntradaDados extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private Objetos.Grafo grafo2;
    private FramePrincipal frame;
    private javax.swing.ButtonGroup buttonGroup = new javax.swing.ButtonGroup();;
    private static final Util.Log log = new Util.Log();

    public EntradaDados(FramePrincipal frame) {
        initComponents();
        this.frame = frame;
        this.grafo2 = new Objetos.Grafo();

        // Grupo de botões para informar se o grafo é completo ou se o usuário definirá as adjacências

        buttonGroup.add(rButtonCompleto);
        buttonGroup.add(rButtonDefinir);
        // Fim do grupo de botões da direção das arestas
        log.put("EntradaDados", "Construtor", "FramePrincipal construido com sucesso");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        entradaNos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        entradaArestas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rButtonCompleto = new javax.swing.JRadioButton();
        rButtonDefinir = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cBoxNoInicial = new javax.swing.JComboBox<String>();
        labelDefinirNo = new javax.swing.JLabel();
        labelDefinirNo2 = new javax.swing.JLabel();
        labelDefinirAresta = new javax.swing.JLabel();
        cBoxAresta = new javax.swing.JComboBox<String>();
        cBoxNoFinal = new javax.swing.JComboBox<String>();
        buttonDefinirAdjacencia = new javax.swing.JButton();
        buttonCriarGrafo = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        jlInfoMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Grafo");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Grafo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Principal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("Grafo = (N, A, G);");

        jLabel2.setText("N = Conjunto de nós.");

        jLabel3.setText("A = Conjunto de arestas.");

        jLabel4.setText("G = Função de adjacência entre os nós.");

        jLabel5.setText("Insira os dados do grafo:");

        jLabel6.setText("N = {");

        entradaNos.setToolTipText("Exemplo: N = {A, B, C}");
        entradaNos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entradaNos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaNosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaNosFocusLost(evt);
            }
        });

        jLabel7.setText("A = {");

        entradaArestas.setToolTipText("Exemplo: A = {a1, a2, a3}");
        entradaArestas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        entradaArestas.setEnabled(false);
        entradaArestas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                entradaArestasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                entradaArestasFocusLost(evt);
            }
        });

        jLabel8.setText("}");

        jLabel9.setText("}");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(entradaNos, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaNos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Definição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Forma de Criação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        rButtonCompleto.setSelected(true);
        rButtonCompleto.setText("Automático");
        rButtonCompleto.setToolTipText("Definir o grafo de forma completa");
        rButtonCompleto.setContentAreaFilled(false);
        rButtonCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rButtonCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonCompletoActionPerformed(evt);
            }
        });

        rButtonDefinir.setText("Manual");
        rButtonDefinir.setToolTipText("Definir a adjcência dos nós");
        rButtonDefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rButtonDefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButtonDefinirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rButtonCompleto)
                .addGap(18, 18, 18)
                .addComponent(rButtonDefinir)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rButtonCompleto)
                    .addComponent(rButtonDefinir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adjacências", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 0, 12))); // NOI18N

        cBoxNoInicial.setToolTipText("");
        cBoxNoInicial.setEnabled(false);

        labelDefinirNo.setText("Nó:");
        labelDefinirNo.setEnabled(false);

        labelDefinirNo2.setText("Adjacênte:");
        labelDefinirNo2.setEnabled(false);

        labelDefinirAresta.setText("Aresta:");
        labelDefinirAresta.setEnabled(false);

        cBoxAresta.setEnabled(false);

        cBoxNoFinal.setEnabled(false);

        buttonDefinirAdjacencia.setText("Definir Adjacência");
        buttonDefinirAdjacencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDefinirAdjacencia.setEnabled(false);
        buttonDefinirAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDefinirAdjacenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonDefinirAdjacencia)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDefinirNo2)
                            .addComponent(labelDefinirNo)
                            .addComponent(labelDefinirAresta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cBoxNoFinal, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                            .addComponent(cBoxAresta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxNoInicial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDefinirNo)
                    .addComponent(cBoxNoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxNoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDefinirNo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDefinirAresta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDefinirAdjacencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonCriarGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Images/ic_save.png"))); // NOI18N
        buttonCriarGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCriarGrafo.setPreferredSize(new java.awt.Dimension(64, 64));
        buttonCriarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCriarGrafoActionPerformed(evt);
            }
        });

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Images/ic_exit.png"))); // NOI18N
        buttonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelar.setPreferredSize(new java.awt.Dimension(75, 40));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Images/ic_clear.png"))); // NOI18N
        buttonLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLimpar.setPreferredSize(new java.awt.Dimension(64, 64));
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCriarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlInfoMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buttonCriarGrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rButtonDefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonDefinirActionPerformed
        if (entradaNos.getText().equals("")) {
            rButtonDefinir.setSelected(false);
            rButtonCompleto.setSelected(true);
            Util.MensagemCtrl.callMessage("Informe os Nós para definir", "Aviso", 2);
            log.put("EntradaDados", "rButtonDefinirActionPerformed", 0, "Informe os nós para definir");
        } else if (nosRepetidos()) {
            rButtonDefinir.setSelected(false);
            rButtonCompleto.setSelected(true);
            Util.MensagemCtrl.callMessage("Existem nós com o mesmo nome", "Aviso", 2);
            log.put("EntradaDados", "rButtonDefinirActionPerformed", 1, "Existem nós com o mesmo nome");
        } else {
            botaoDefinir();
        }
    }//GEN-LAST:event_rButtonDefinirActionPerformed

    private void rButtonCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButtonCompletoActionPerformed
        entradaNos.setText("");
        entradaArestas.setText("");
        entradaArestas.setEnabled(false);
        labelDefinirNo.setEnabled(false);
        labelDefinirNo2.setEnabled(false);
        labelDefinirAresta.setEnabled(false);
        cBoxNoInicial.setEnabled(false);
        cBoxNoFinal.setEnabled(false);
        cBoxAresta.setEnabled(false);
        cBoxNoInicial.removeAllItems();
        cBoxNoFinal.removeAllItems();
        cBoxAresta.removeAllItems();
        buttonDefinirAdjacencia.setEnabled(false);
        buttonCriarGrafo.setEnabled(true);
        cancelarCriacaoGrafo();

    }//GEN-LAST:event_rButtonCompletoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        exit();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void entradaArestasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaArestasFocusLost
        jlInfoMessage.setText("");
        if (entradaArestas.getText().equals("")) {
            Util.MensagemCtrl.callMessage("Informe as Arestas para definir o grafo", "Aviso", 2);
            log.put("EntradaDados", "entradaArestasFocusLost", 0, "Informe as Arestas para definir o grafo");

        } else if (arestasRepetidas()) {
            Util.MensagemCtrl.callMessage("Existem arestas com o mesmo nome", "Aviso", 2);
            log.put("EntradaDados", "entradaArestasFocusLost", 1, "Existem arestas com o mesmo nome");

        } else {
            try {
                grafo2.setArestas(capturarArestas(entradaArestas.getText()));
                grafo2.iniciarMatriz(new Objetos.Armazenamento.MatrizInc(), grafo2.quantidadeNos(), grafo2.quantidadeArestas());
                grafo2.iniciarListas();
                cBoxAresta.removeAllItems();
                botaoDefinir();
                for (String arestaa : grafo2.getArestas()) {
                    cBoxAresta.addItem(arestaa);
                }
                buttonDefinirAdjacencia.setEnabled(true);
            } catch (Exception e) {
                Util.MensagemCtrl.callMessage("Valores inválidos para as Arestas informadas", "Aviso", 8);
                log.put("EntradaDados", "entradaArestasFocusLost", 2, "Valores inválidos para as Arestas informadas");

                entradaArestas.setFocusable(true);
            }
        }
    }//GEN-LAST:event_entradaArestasFocusLost

    private void buttonDefinirAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefinirAdjacenciaActionPerformed
        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizAdj(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizInc(), posicaoNoInicialSelecionado(), posicaoNoFinalSelecionado(), posicaoArestaSelecionada());
        grafo2.alterarListaGrafoNaoDirecionado(grafo2.getNoPosicao(posicaoNoInicialSelecionado()), grafo2.getNoPosicao(posicaoNoFinalSelecionado()), grafo2.getArestaPosicao(posicaoArestaSelecionada()));

        //Após definir remove a aresta da seleção de acordo com o index
        cBoxAresta.removeItemAt(cBoxAresta.getSelectedIndex());
        if (cBoxAresta.getSelectedIndex() == -1) {
            buttonDefinirAdjacencia.setEnabled(false);
            buttonCriarGrafo.setEnabled(true);
        }
    }//GEN-LAST:event_buttonDefinirAdjacenciaActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        resetarJanela();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonCriarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCriarGrafoActionPerformed
        if (rButtonDefinir.isSelected()) {
            frame.setGrafo(grafo2);
            exit();
        } else if (entradaNos.getText().trim().equals("")) {
            Util.MensagemCtrl.callMessage("É necessário informar os nós para criar o grafo", "Aviso", 2);
        } else {
            // CRIA AUTOMATICAMENTE O GRAFO COMPLETO
            grafo2.setNos(capturarNos(entradaNos.getText()));

            if (grafo2.quantidadeNos() == 1) {
                Util.MensagemCtrl.callMessage("Não é posśivel criar um grafo completo com apenas um nó", "Aviso", 2);

            } else if (nosRepetidos()) {
                Util.   MensagemCtrl.callMessage("Existem nós com o mesmo nome", "Aviso", 2);
            } else {

                int contArestas = 0;
                for (int i = 0; i < grafo2.quantidadeNos(); i++) {
                    for (int j = i + 1; j < grafo2.quantidadeNos(); j++) {
                        contArestas++;
                    }
                }

                grafo2.iniciarMatriz(new Objetos.Armazenamento.MatrizAdj(), grafo2.quantidadeNos(), grafo2.quantidadeNos()); // Adjacência
                grafo2.iniciarListas();

                String[] arestasNaoDirecionado = new String[contArestas];
                for (int i = 0; i < contArestas; i++) {
                    arestasNaoDirecionado[i] = String.valueOf(i);
                }

                grafo2.setArestas(arestasNaoDirecionado);
                grafo2.iniciarMatriz(new Objetos.Armazenamento.MatrizInc(), grafo2.quantidadeNos(), grafo2.quantidadeArestas());
                contArestas = 0;
                for (int i = 0; i < grafo2.quantidadeNos(); i++) {
                    for (int j = i + 1; j < grafo2.quantidadeNos(); j++) {
                        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizAdj(), i, j, contArestas);
                        grafo2.alterarMatrizGrafoNaoDirecionado(grafo2.getMatrizInc(), i, j, contArestas);
                        grafo2.alterarListaGrafoNaoDirecionado(grafo2.getNoPosicao(i), grafo2.getNoPosicao(j), grafo2.getArestaPosicao(contArestas++));
                    }
                }
                frame.setVisible(true);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    log.put("EntradaDados", "buttonCriarGrafoActionPerformed", ex.getMessage());
                }
                frame.setGrafo(grafo2);
                exit();
            } // fim do else            
        } // fim do else
    }//GEN-LAST:event_buttonCriarGrafoActionPerformed

    private void entradaNosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNosFocusGained
        jlInfoMessage.setText("Exemplo: N = {A, B, C}");
    }//GEN-LAST:event_entradaNosFocusGained

    private void entradaNosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaNosFocusLost
        jlInfoMessage.setText("");
    }//GEN-LAST:event_entradaNosFocusLost

    private void entradaArestasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_entradaArestasFocusGained
        jlInfoMessage.setText("Exemplo: A = {a1, a2, a3}");
    }//GEN-LAST:event_entradaArestasFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Verifica se há nós repetidos digitado pelo usuário
     *
     * @return boolean - Retorna true se existir nó repetido e false se não
     * existir
     */
    private boolean nosRepetidos() {
        String[] n = capturarNos(entradaNos.getText());
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i].equals(n[j]) && i != j) {
                    log.put("EntradaDados", "nosRepetidos", 0, "Há nós repetidos] [TRUE");

                    return true;
                }
            }
        }
        log.put("EntradaDados", "nosRepetidos", 1, "Não há nós repetidos] [FALSE");
        return false;
    }

    /**
     * Verifica se há arestas repetidas digitada pelo usuário
     *
     * @return boolean - Retorna true se existir aresta repetida e false se não
     * existir
     */
    private boolean arestasRepetidas() {
        String[] a = capturarArestas(entradaArestas.getText());
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j]) && i != j) {
                    log.put("EntradaDados", "arestasRepetidas", 0, "Há arestas repetidas] [TRUE");
                    return true;
                }
            }
        }
        log.put("EntradaDados", "arestasRepetidas", 1, "Não há arestas repetidas] [FALSE");
        return false;
    }

    /**
     * Retorna a posição do primeiro nó no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição do nó selecionado
     */
    private int posicaoNoInicialSelecionado() {
        String tempNoInicialSelected = cBoxNoInicial.getItemAt(cBoxNoInicial.getSelectedIndex());
        int posicaoLinhaNo = 0;
        for (int i = 0; i < grafo2.quantidadeNos(); i++) {
            if (grafo2.getNos()[i].equals(tempNoInicialSelected)) {
                posicaoLinhaNo = i;
                break;
            }
        }
        log.put("EntradaDados", "posicaoNoInicialSelecionado", 1, Integer.toString(posicaoLinhaNo));
        return posicaoLinhaNo;
    }

    /**
     * Retorna a posição do segundo nó no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição do nó selecionado
     */
    private int posicaoNoFinalSelecionado() {
        String tempNoFinalSelected = cBoxNoFinal.getItemAt(cBoxNoFinal.getSelectedIndex());
        int posicaoColunaNo = 0;
        for (int i = 0; i < grafo2.quantidadeNos(); i++) {
            if (grafo2.getNos()[i].equals(tempNoFinalSelected)) {
                posicaoColunaNo = i;
                break;
            }
        }
        log.put("EntradaDados", "posicaoNoFinalSelecionado", 1, Integer.toString(posicaoColunaNo));
        return posicaoColunaNo;
    }

    /**
     * Retorna a posição da aresta no array de acordo com o que o usuário
     * selecionou no JComboBox
     *
     * @return int - retorna a posição da aresta selecionado
     */
    private int posicaoArestaSelecionada() {
        String tempArestaSelected = cBoxAresta.getItemAt(cBoxAresta.getSelectedIndex());
        int posicaoAresta = 0;
        for (int i = 0; i < grafo2.quantidadeArestas(); i++) {
            if (grafo2.getArestas()[i].equals(tempArestaSelected)) {
                posicaoAresta = i;
                break;
            }
        }
        log.put("EntradaDados", "posicaoArestaSelecionada", 1, Integer.toString(posicaoAresta));
        return posicaoAresta;
    }

    /**
     * Método para capturar os nós informandos pelo usuário
     *
     * @return String[] - retorna um array com os nós informados pelo usuário
     */
    private String[] capturarNos(String entradaNos) {
        String[] nos = entradaNos.replace(" ", "").split(",");
        log.put("EntradaDados", "capturarNos", java.util.Arrays.toString(nos));
        return nos;
    }

    /**
     * Método para capturar as arestas informandas pelo usuário
     *
     * @return String[] - retorna um array com as arestas informadas pelo
     * usuário
     */
    private String[] capturarArestas(String entradaArestas) {
        String[] nos = entradaArestas.replace(" ", "").split(",");
        log.put("EntradaDados", "capturarArestas", java.util.Arrays.toString(nos));
        return nos;
    }

    private void botaoDefinir() {
        grafo2.setNos(capturarNos(entradaNos.getText()));
        if (!grafo2.noIsEmpty()) {
            grafo2.iniciarMatriz(new Objetos.Armazenamento.MatrizAdj(), grafo2.quantidadeNos(), grafo2.quantidadeNos());
            // A matriz de incidência é inicializada quando tirar o foco do campo de arestas pois as colunas é o número de arestas,
            // quanto clicar neste botão ainda não tem o número de arestas para poder inicialiar a matriz de Incidência.
            grafo2.iniciarListas();
            cBoxNoInicial.removeAllItems();
            cBoxNoFinal.removeAllItems();
            for (String no : grafo2.getNos()) {
                cBoxNoInicial.addItem(no);
                cBoxNoFinal.addItem(no);
            }
            entradaArestas.setEnabled(true);
            labelDefinirNo.setEnabled(true);
            labelDefinirNo2.setEnabled(true);
            labelDefinirAresta.setEnabled(true);
            cBoxNoInicial.setEnabled(true);
            cBoxNoFinal.setEnabled(true);
            cBoxAresta.setEnabled(true);
            buttonCriarGrafo.setEnabled(false);
            log.put("EntradaDados", "botaoDefinir", 1, "Sucesso");

        }
    }

    /**
     * Método para voltar a janela ao estado inicial a sua abertura
     *
     */
    protected void resetarJanela() {
        entradaNos.setEnabled(true);
        entradaNos.setText("");
        entradaArestas.setEnabled(false);
        entradaArestas.setText("");
        rButtonCompleto.setSelected(true);
        rButtonDefinir.setSelected(false);
        labelDefinirNo.setEnabled(false);
        labelDefinirNo2.setEnabled(false);
        labelDefinirAresta.setEnabled(false);
        cBoxNoInicial.setEnabled(false);
        cBoxNoInicial.removeAllItems();
        cBoxNoFinal.setEnabled(false);
        cBoxNoFinal.removeAllItems();
        cBoxAresta.setEnabled(false);
        cBoxAresta.removeAllItems();
        buttonDefinirAdjacencia.setEnabled(false);
        buttonCriarGrafo.setEnabled(true);
        cancelarCriacaoGrafo();
        log.put("EntradaDados", "resetarJanela", 1, "Sucesso");

    }

    /**
     * Método para cancelar a criação do grafo
     */
    private void cancelarCriacaoGrafo() {
        if (grafo2.getMatrizAdj() == null) {
            grafo2.destruirGrafo();
            log.put("EntradaDados", "cancelarCriacaoGrafo", 1, "Sucesso");

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCriarGrafo;
    private javax.swing.JButton buttonDefinirAdjacencia;
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JComboBox<String> cBoxAresta;
    private javax.swing.JComboBox<String> cBoxNoFinal;
    private javax.swing.JComboBox<String> cBoxNoInicial;
    private javax.swing.JTextField entradaArestas;
    private javax.swing.JTextField entradaNos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlInfoMessage;
    private javax.swing.JLabel labelDefinirAresta;
    private javax.swing.JLabel labelDefinirNo;
    private javax.swing.JLabel labelDefinirNo2;
    private javax.swing.JRadioButton rButtonCompleto;
    private javax.swing.JRadioButton rButtonDefinir;
    // End of variables declaration//GEN-END:variables

    private void exit() {
        frame.setVisible(true);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            log.put("EntradaDados", "exit", 0, ex.getMessage());
        }
        this.dispose();
        log.put("EntradaDados", "exit", 1, "FramePrincipal chaamdo com sucesso");
    }
}

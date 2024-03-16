package com.sycomore.view.workspace;

import com.sycomore.view.components.Workspace;
import com.sycomore.view.workspace.control.PromotionsPanel;
import com.sycomore.view.workspace.control.StudyFeesPanel;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel implements Workspace.WorkspaceItem {

    public ControlPanel() {
        super(new BorderLayout());

        JTabbedPane pane = new JTabbedPane();

        pane.addTab("Promotions", new PromotionsPanel());
        pane.addTab("Frais d'étude", new StudyFeesPanel());
        pane.addTab("Frais connexe", new JPanel());
        add(pane, BorderLayout.CENTER);
    }

    @Override
    public String getName() {
        return "control";
    }

    @Override
    public JComponent getComponent() {
        return this;
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onHide() {

    }
}

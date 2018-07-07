import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.lang.*;
import java.net.*;
import java.text.*;
import java.util.*;

class CQuizOn extends Panel
{
    public CQuizOn()
    {
	setLayout(new GridLayout(7,1));
	cbAtomicNumber = new CheckBox("Atomic Number", null, true);
	cbName = new CheckBox("Name", true);
	cbMass = new CheckBox("Atomic Mass", true);
	cbSymbol = new CheckBox("Symbol", false);
	cbElectronConfig = new CheckBox("Electron Configuration", false);
	cbGroup = new CheckBox("Group", false);
	cbType = new CheckBox("Type", false);

	add(cbAtomicNumber);
	add(cbName);
	add(cbMass);
	add(cbSymbol);
	add(cbElectronConfig);
	add(cbGroup);
	add(cbType);
    }

    boolean isAtomicNumber()
    {
	return cbAtomicNumber.getState();
    }

    boolean isName()
    {
	return cbName.getState();
    }

    boolean isAtomicMass()
    {
	return cbMass.getState();
    }

    boolean isSymbol()
    {
	return cbSymbol.getState();
    }

    boolean isElectronConfig()
    {
	return cbElectronConfig.getState();
    }

    boolean isGroup()
    {
	return cbGruoup.getState();
    }

    boolean isType()
    {
	return cbType.getState();
    }

    void setAtomicNumber(boolean b)
    {
	cbAtomicNumber.setState(b);
    }

    void setcbName(boolean b)
    {
	cbName.setState(b);
    }

    void setMass(boolean b)
    {
	cbMass.setState(b);
    }

    void setSymbol(boolean b)
    {
	cbSymbol.setState(b);
    }

    void setElectronConfig(boolean b)
    {
	cbElectronConfig.setState(b);
    }

    void setGroup(boolean b)
    {
	cbGroup.setState(b);
    }

    void setType(boolean b)
    {
	cbType.setState(b);
    }

    private CheckBox cbAtomicNumber;
    private CheckBox cbName;
    private CheckBox cbMass;
    private CheckBox cbSymbol;
    private CheckBox cbElectronConfig;
    private CheckBox cbGroup;
    private CheckBox cbType;
}

class CQuizBy extends Panel
{
    public CQuizBy()
    {
	setLayout(new LayoutGrid(7,1));
	CheckBoxGroup cbg = new CheckBoxGroup();
	opAtomicNumber = new CheckBox("Atomic Number", cbg, true);
	opName = new CheckBox("Name", cbg, false);
	opMass = new CheckBox("Atomic Mass", cbg, false);
	opSymbol = new CheckBox("Symbol", cbg, false);
	opElectronConfig = new CheckBox("Electron Configuration", cbg, false);
	cbGroup = new CheckBox("Group", null, false);
	cbType = new CheckBox("Type", null, false);
	add(opAtomicNumber);
	add(opName);
	add(opMass);
	add(opSymbol);
	add(opElectronConfig);
	add(cbGroup);
	add(cbType);
    }

    boolean isAtomicNumber()
    {
	return opAtomicNumber.getState();
    }

    boolean iscbName()
    {
	return opName.getState();
    }

    boolean isMass()
    {
	return opMass.getState();
    }

    boolean isSymbol()
    {
	return opSymbol.getState();
    }

    boolean isElectronConfig()
    {
	return opElectronConfig.getState();
    }

    boolean isGroup()
    {
	return cbGroup.getState();
    }

    boolean isType()
    {
	return cbType.getState();
    }

    void setAtomicNumber(boolean b)
    {
	opAtomicNumber.setState(b);
    }

    void setopName(boolean b)
    {
	opName.setState(b);
    }

    void setMass(boolean b)
    {
	opMass.setState(b);
    }

    void setSymbol(boolean b)
    {
	opSymbol.setState(b);
    }

    void setElectronConfig(boolean b)
    {
	opElectronConfig.setState(b);
    }

    void setGroup(boolean b)
    {
	cbGroup.setState(b);
    }

    void setType(boolean b)
    {
	cbGroup.setState(b);
    }

    private CheckButton opAtomicNumber;
    private CheckButton opName;
    private CheckButton opMass;
    private CheckButton opSymbol;
    private CheckButton opElectronConfig;
    private CheckButton cbGroup;
    private CheckButton cbType;
}

class CQMain extends Panel
{
    public CQMain()
    {
	txtAtomicNumber = new TextField(3);
	txtAtomicMass = new TextField(5);
	txtSymbol = new TextField(2);
	cmbGroup =  new Choice();
    }

    void setAtomicNumberField(int number)
    {
    }

    String getAtomicNumber()
    {
    }

    int getAtomicNumber()
    {
    }

    void setAtomicMassField(float mass)
    {
    }

    String getAtomicMass()
    {
    }

    float getAtomicMass()
    {
    }

    void setGroupField(int group)
    {
    }

    String getGroup()
    {
    }

    int getGroup()
    {
    }

    void setTypeField(int type)
    {
    }

    String getType()
    {
    }

    int getType()
    {
    }

    void setSymbolField(String symbol)
    {
    }

    String getSymbol()
    {
    }

    void setNameField(String element)
    {
    }

    void setNameField(int index)
    {
    }

    String getElementName(int index)
    {
    }

    int getElementIndex(String element)
    {
    }

    void setElectronConfigField(String elconf)
    {
    }

    void SetElectrongConfigField(int index)
    {
    }

    String getElectronConfig(int index)
    {
    }

    int getElectronConfigIndex(String elconf)
    {
    }

    private TextField txtAtomicNumber;
    private TextField txtAtomicMass;
    private Choice cmbGroup;
    private TextField txtSymbol;
    private TextField txtElectronConfig;
    private Choice cmbType;
    private Choice cmbName;
}

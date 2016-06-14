/**
 */
package es.unizar.disco.simulation.models.invocation.impl;

import es.unizar.disco.simulation.models.datatypes.Resource;
import es.unizar.disco.simulation.models.datatypes.SimulationStatus;

import es.unizar.disco.simulation.models.definition.DefinitionPackage;
import es.unizar.disco.simulation.models.definition.SimulationDefinition;
import es.unizar.disco.simulation.models.definition.VariableConfiguration;

import es.unizar.disco.simulation.models.invocation.InvocationPackage;
import es.unizar.disco.simulation.models.invocation.SimulationInvocation;

import es.unizar.disco.simulation.models.simresult.SimresultPackage;
import es.unizar.disco.simulation.models.simresult.SimulationResult;

import es.unizar.disco.simulation.models.toolresult.ToolResult;

import es.unizar.disco.simulation.models.traces.TraceSet;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getTraceSet <em>Trace Set</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getToolResult <em>Tool Result</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getResults <em>Results</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getAnalyzableResource <em>Analyzable Resource</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getDomainResource <em>Domain Resource</em>}</li>
 *   <li>{@link es.unizar.disco.simulation.models.invocation.impl.SimulationInvocationImpl#getVariableConfiguration <em>Variable Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationInvocationImpl extends MinimalEObjectImpl.Container implements SimulationInvocation {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceSet() <em>Trace Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceSet()
	 * @generated
	 * @ordered
	 */
	protected TraceSet traceSet;

	/**
	 * The cached value of the '{@link #getToolResult() <em>Tool Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolResult()
	 * @generated
	 * @ordered
	 */
	protected ToolResult toolResult;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected SimulationDefinition definition;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulationResult> results;

	/**
	 * The cached value of the '{@link #getAnalyzableResource() <em>Analyzable Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzableResource()
	 * @generated
	 * @ordered
	 */
	protected Resource analyzableResource;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SimulationStatus STATUS_EDEFAULT = SimulationStatus.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SimulationStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainResource() <em>Domain Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainResource()
	 * @generated
	 * @ordered
	 */
	protected static final URI DOMAIN_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableConfiguration() <em>Variable Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableConfiguration()
	 * @generated
	 * @ordered
	 */
	protected VariableConfiguration variableConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvocationPackage.Literals.SIMULATION_INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceSet getTraceSet() {
		if (traceSet != null && traceSet.eIsProxy()) {
			InternalEObject oldTraceSet = (InternalEObject)traceSet;
			traceSet = (TraceSet)eResolveProxy(oldTraceSet);
			if (traceSet != oldTraceSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvocationPackage.SIMULATION_INVOCATION__TRACE_SET, oldTraceSet, traceSet));
			}
		}
		return traceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceSet basicGetTraceSet() {
		return traceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceSet(TraceSet newTraceSet) {
		TraceSet oldTraceSet = traceSet;
		traceSet = newTraceSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__TRACE_SET, oldTraceSet, traceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolResult getToolResult() {
		if (toolResult != null && toolResult.eIsProxy()) {
			InternalEObject oldToolResult = (InternalEObject)toolResult;
			toolResult = (ToolResult)eResolveProxy(oldToolResult);
			if (toolResult != oldToolResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT, oldToolResult, toolResult));
			}
		}
		return toolResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolResult basicGetToolResult() {
		return toolResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolResult(ToolResult newToolResult) {
		ToolResult oldToolResult = toolResult;
		toolResult = newToolResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT, oldToolResult, toolResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationDefinition getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (SimulationDefinition)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvocationPackage.SIMULATION_INVOCATION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationDefinition basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(SimulationDefinition newDefinition, NotificationChain msgs) {
		SimulationDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(SimulationDefinition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, DefinitionPackage.SIMULATION_DEFINITION__INVOCATIONS, SimulationDefinition.class, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, DefinitionPackage.SIMULATION_DEFINITION__INVOCATIONS, SimulationDefinition.class, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulationResult> getResults() {
		if (results == null) {
			results = new EObjectWithInverseResolvingEList<SimulationResult>(SimulationResult.class, this, InvocationPackage.SIMULATION_INVOCATION__RESULTS, SimresultPackage.SIMULATION_RESULT__INVOCATION);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAnalyzableResource() {
		return analyzableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalyzableResource(Resource newAnalyzableResource, NotificationChain msgs) {
		Resource oldAnalyzableResource = analyzableResource;
		analyzableResource = newAnalyzableResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE, oldAnalyzableResource, newAnalyzableResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalyzableResource(Resource newAnalyzableResource) {
		if (newAnalyzableResource != analyzableResource) {
			NotificationChain msgs = null;
			if (analyzableResource != null)
				msgs = ((InternalEObject)analyzableResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE, null, msgs);
			if (newAnalyzableResource != null)
				msgs = ((InternalEObject)newAnalyzableResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE, null, msgs);
			msgs = basicSetAnalyzableResource(newAnalyzableResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE, newAnalyzableResource, newAnalyzableResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SimulationStatus newStatus) {
		SimulationStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getDomainResource() {
		// TODO: implement this method to return the 'Domain Resource' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableConfiguration getVariableConfiguration() {
		if (variableConfiguration != null && variableConfiguration.eIsProxy()) {
			InternalEObject oldVariableConfiguration = (InternalEObject)variableConfiguration;
			variableConfiguration = (VariableConfiguration)eResolveProxy(oldVariableConfiguration);
			if (variableConfiguration != oldVariableConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION, oldVariableConfiguration, variableConfiguration));
			}
		}
		return variableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableConfiguration basicGetVariableConfiguration() {
		return variableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableConfiguration(VariableConfiguration newVariableConfiguration) {
		VariableConfiguration oldVariableConfiguration = variableConfiguration;
		variableConfiguration = newVariableConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION, oldVariableConfiguration, variableConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				if (definition != null)
					msgs = ((InternalEObject)definition).eInverseRemove(this, DefinitionPackage.SIMULATION_DEFINITION__INVOCATIONS, SimulationDefinition.class, msgs);
				return basicSetDefinition((SimulationDefinition)otherEnd, msgs);
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE:
				return basicSetAnalyzableResource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__IDENTIFIER:
				return getIdentifier();
			case InvocationPackage.SIMULATION_INVOCATION__TRACE_SET:
				if (resolve) return getTraceSet();
				return basicGetTraceSet();
			case InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT:
				if (resolve) return getToolResult();
				return basicGetToolResult();
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				return getResults();
			case InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE:
				return getAnalyzableResource();
			case InvocationPackage.SIMULATION_INVOCATION__START:
				return getStart();
			case InvocationPackage.SIMULATION_INVOCATION__END:
				return getEnd();
			case InvocationPackage.SIMULATION_INVOCATION__STATUS:
				return getStatus();
			case InvocationPackage.SIMULATION_INVOCATION__DOMAIN_RESOURCE:
				return getDomainResource();
			case InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION:
				if (resolve) return getVariableConfiguration();
				return basicGetVariableConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__TRACE_SET:
				setTraceSet((TraceSet)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT:
				setToolResult((ToolResult)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				setDefinition((SimulationDefinition)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends SimulationResult>)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE:
				setAnalyzableResource((Resource)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__START:
				setStart((Date)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__END:
				setEnd((Date)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__STATUS:
				setStatus((SimulationStatus)newValue);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION:
				setVariableConfiguration((VariableConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__TRACE_SET:
				setTraceSet((TraceSet)null);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT:
				setToolResult((ToolResult)null);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				setDefinition((SimulationDefinition)null);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				getResults().clear();
				return;
			case InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE:
				setAnalyzableResource((Resource)null);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__START:
				setStart(START_EDEFAULT);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__END:
				setEnd(END_EDEFAULT);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION:
				setVariableConfiguration((VariableConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InvocationPackage.SIMULATION_INVOCATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case InvocationPackage.SIMULATION_INVOCATION__TRACE_SET:
				return traceSet != null;
			case InvocationPackage.SIMULATION_INVOCATION__TOOL_RESULT:
				return toolResult != null;
			case InvocationPackage.SIMULATION_INVOCATION__DEFINITION:
				return definition != null;
			case InvocationPackage.SIMULATION_INVOCATION__RESULTS:
				return results != null && !results.isEmpty();
			case InvocationPackage.SIMULATION_INVOCATION__ANALYZABLE_RESOURCE:
				return analyzableResource != null;
			case InvocationPackage.SIMULATION_INVOCATION__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case InvocationPackage.SIMULATION_INVOCATION__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case InvocationPackage.SIMULATION_INVOCATION__STATUS:
				return status != STATUS_EDEFAULT;
			case InvocationPackage.SIMULATION_INVOCATION__DOMAIN_RESOURCE:
				return DOMAIN_RESOURCE_EDEFAULT == null ? getDomainResource() != null : !DOMAIN_RESOURCE_EDEFAULT.equals(getDomainResource());
			case InvocationPackage.SIMULATION_INVOCATION__VARIABLE_CONFIGURATION:
				return variableConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SimulationInvocationImpl

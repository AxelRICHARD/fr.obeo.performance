/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 */
package fr.obeo.performance.provider;

import fr.obeo.performance.util.PerformanceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformanceItemProviderAdapterFactory extends PerformanceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PerformanceItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.SystemUnderTest} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SystemUnderTestItemProvider systemUnderTestItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.SystemUnderTest}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSystemUnderTestAdapter() {
        if (systemUnderTestItemProvider == null) {
            systemUnderTestItemProvider = new SystemUnderTestItemProvider(this);
        }

        return systemUnderTestItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.Environment} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnvironmentItemProvider environmentItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.Environment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEnvironmentAdapter() {
        if (environmentItemProvider == null) {
            environmentItemProvider = new EnvironmentItemProvider(this);
        }

        return environmentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.Scenario} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScenarioItemProvider scenarioItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.Scenario}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createScenarioAdapter() {
        if (scenarioItemProvider == null) {
            scenarioItemProvider = new ScenarioItemProvider(this);
        }

        return scenarioItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.Property} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyItemProvider propertyItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.Property}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPropertyAdapter() {
        if (propertyItemProvider == null) {
            propertyItemProvider = new PropertyItemProvider(this);
        }

        return propertyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.PerformanceTest} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerformanceTestItemProvider performanceTestItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.PerformanceTest}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPerformanceTestAdapter() {
        if (performanceTestItemProvider == null) {
            performanceTestItemProvider = new PerformanceTestItemProvider(this);
        }

        return performanceTestItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.TestResult} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TestResultItemProvider testResultItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.TestResult}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTestResultAdapter() {
        if (testResultItemProvider == null) {
            testResultItemProvider = new TestResultItemProvider(this);
        }

        return testResultItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.DataPoint} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataPointItemProvider dataPointItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.DataPoint}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataPointAdapter() {
        if (dataPointItemProvider == null) {
            dataPointItemProvider = new DataPointItemProvider(this);
        }

        return dataPointItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link fr.obeo.performance.Measure} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasureItemProvider measureItemProvider;

    /**
     * This creates an adapter for a {@link fr.obeo.performance.Measure}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createMeasureAdapter() {
        if (measureItemProvider == null) {
            measureItemProvider = new MeasureItemProvider(this);
        }

        return measureItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (systemUnderTestItemProvider != null) systemUnderTestItemProvider.dispose();
        if (environmentItemProvider != null) environmentItemProvider.dispose();
        if (scenarioItemProvider != null) scenarioItemProvider.dispose();
        if (propertyItemProvider != null) propertyItemProvider.dispose();
        if (performanceTestItemProvider != null) performanceTestItemProvider.dispose();
        if (testResultItemProvider != null) testResultItemProvider.dispose();
        if (dataPointItemProvider != null) dataPointItemProvider.dispose();
        if (measureItemProvider != null) measureItemProvider.dispose();
    }

}

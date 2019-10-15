import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NotreadComponent } from './notread.component';

describe('NotreadComponent', () => {
  let component: NotreadComponent;
  let fixture: ComponentFixture<NotreadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NotreadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NotreadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowhomeComponent } from './showhome.component';

describe('ShowhomeComponent', () => {
  let component: ShowhomeComponent;
  let fixture: ComponentFixture<ShowhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

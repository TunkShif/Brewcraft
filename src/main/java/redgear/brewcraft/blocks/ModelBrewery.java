package redgear.brewcraft.blocks;

import net.minecraft.entity.*;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelBrewery extends ModelBase
{

    ModelRenderer Base1;
    ModelRenderer Base2;
    ModelRenderer Base3;
    ModelRenderer Base4;
    ModelRenderer Base5;
    ModelRenderer Base6;
    ModelRenderer Base7;
    ModelRenderer Cauldron1Leg1;
    ModelRenderer Cauldron1Leg2;
    ModelRenderer Cauldron1Leg3;
    ModelRenderer Cauldron1Leg4;
    ModelRenderer Cauldron1Body1;
    ModelRenderer Cauldron1Body2;
    ModelRenderer Cauldron1Body3;
    ModelRenderer Cauldron1Body4;
    ModelRenderer Base8;
    ModelRenderer Blazerod;
    ModelRenderer Cauldron2Leg1;
    ModelRenderer Cauldron2Leg2;
    ModelRenderer Cauldron2Leg3;
    ModelRenderer Cauldron2Leg4;
    ModelRenderer Cauldron2Body1;
    ModelRenderer Cauldron2Body2;
    ModelRenderer Cauldron2Body3;
    ModelRenderer Cauldron2Body4;
  
  public ModelBrewery()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base1 = new ModelRenderer(this, 0, 0);
      Base1.addBox(0F, 0F, 0F, 16, 1, 10);
      Base1.setRotationPoint(-8F, 23F, -5F);
      Base1.setTextureSize(128, 64);
      Base1.mirror = true;
      setRotation(Base1, 0F, 0F, 0F);
      Base2 = new ModelRenderer(this, 0, 13);
      Base2.addBox(0F, 0F, 0F, 2, 1, 2);
      Base2.setRotationPoint(-7F, 23F, -7F);
      Base2.setTextureSize(128, 64);
      Base2.mirror = true;
      setRotation(Base2, 0F, 0F, 0F);
      Base3 = new ModelRenderer(this, 54, 0);
      Base3.addBox(0F, 0F, 0F, 10, 1, 3);
      Base3.setRotationPoint(-5F, 23F, -8F);
      Base3.setTextureSize(128, 64);
      Base3.mirror = true;
      setRotation(Base3, 0F, 0F, 0F);
      Base4 = new ModelRenderer(this, 0, 13);
      Base4.addBox(0F, 0F, 0F, 2, 1, 2);
      Base4.setRotationPoint(5F, 23F, -7F);
      Base4.setTextureSize(128, 64);
      Base4.mirror = true;
      setRotation(Base4, 0F, 0F, 0F);
      Base5 = new ModelRenderer(this, 0, 13);
      Base5.addBox(0F, 0F, 0F, 2, 1, 2);
      Base5.setRotationPoint(5F, 23F, 5F);
      Base5.setTextureSize(128, 64);
      Base5.mirror = true;
      setRotation(Base5, 0F, 0F, 0F);
      Base6 = new ModelRenderer(this, 54, 0);
      Base6.addBox(0F, 0F, 0F, 10, 1, 3);
      Base6.setRotationPoint(-5F, 23F, 5F);
      Base6.setTextureSize(128, 64);
      Base6.mirror = true;
      setRotation(Base6, 0F, 0F, 0F);
      Base7 = new ModelRenderer(this, 0, 13);
      Base7.addBox(0F, 0F, 0F, 2, 1, 2);
      Base7.setRotationPoint(-7F, 23F, 5F);
      Base7.setTextureSize(128, 64);
      Base7.mirror = true;
      setRotation(Base7, 0F, 0F, 0F);
      Cauldron1Leg1 = new ModelRenderer(this, 0, 40);
      Cauldron1Leg1.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron1Leg1.setRotationPoint(-7F, 22F, -3F);
      Cauldron1Leg1.setTextureSize(128, 64);
      Cauldron1Leg1.mirror = true;
      setRotation(Cauldron1Leg1, 0F, 0F, 0F);
      Cauldron1Leg2 = new ModelRenderer(this, 0, 40);
      Cauldron1Leg2.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron1Leg2.setRotationPoint(-2F, 22F, -3F);
      Cauldron1Leg2.setTextureSize(128, 64);
      Cauldron1Leg2.mirror = true;
      setRotation(Cauldron1Leg2, 0F, 0F, 0F);
      Cauldron1Leg3 = new ModelRenderer(this, 0, 40);
      Cauldron1Leg3.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron1Leg3.setRotationPoint(-7F, 22F, 2F);
      Cauldron1Leg3.setTextureSize(128, 64);
      Cauldron1Leg3.mirror = true;
      setRotation(Cauldron1Leg3, 0F, 0F, 0F);
      Cauldron1Leg4 = new ModelRenderer(this, 0, 40);
      Cauldron1Leg4.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron1Leg4.setRotationPoint(-2F, 22F, 2F);
      Cauldron1Leg4.setTextureSize(128, 64);
      Cauldron1Leg4.mirror = true;
      setRotation(Cauldron1Leg4, 0F, 0F, 0F);
      Cauldron1Body1 = new ModelRenderer(this, 0, 53);
      Cauldron1Body1.addBox(0F, 0F, 0F, 6, 5, 6);
      Cauldron1Body1.setRotationPoint(-7F, 17F, -3F);
      Cauldron1Body1.setTextureSize(128, 64);
      Cauldron1Body1.mirror = true;
      setRotation(Cauldron1Body1, 0F, 0F, 0F);
      Cauldron1Body2 = new ModelRenderer(this, 30, 56);
      Cauldron1Body2.addBox(0F, 0F, 0F, 5, 3, 5);
      Cauldron1Body2.setRotationPoint(-6.5F, 14F, -2.5F);
      Cauldron1Body2.setTextureSize(128, 64);
      Cauldron1Body2.mirror = true;
      setRotation(Cauldron1Body2, 0F, 0F, 0F);
      Cauldron1Body3 = new ModelRenderer(this, 0, 47);
      Cauldron1Body3.addBox(0F, 0F, 0F, 2, 1, 2);
      Cauldron1Body3.setRotationPoint(-5F, 13F, -1F);
      Cauldron1Body3.setTextureSize(128, 64);
      Cauldron1Body3.mirror = true;
      setRotation(Cauldron1Body3, 0F, 0F, 0F);
      Cauldron1Body4 = new ModelRenderer(this, 0, 35);
      Cauldron1Body4.addBox(0F, 0F, 0F, 1, 3, 1);
      Cauldron1Body4.setRotationPoint(-4.5F, 10F, -0.5F);
      Cauldron1Body4.setTextureSize(128, 64);
      Cauldron1Body4.mirror = true;
      setRotation(Cauldron1Body4, 0F, 0F, 0F);
      Base8 = new ModelRenderer(this, 0, 20);
      Base8.addBox(0F, 0F, 0F, 7, 1, 1);
      Base8.setRotationPoint(-3.5F, 11F, -0.5F);
      Base8.setTextureSize(128, 64);
      Base8.mirror = true;
      setRotation(Base8, 0F, 0F, 0F);
      Blazerod = new ModelRenderer(this, 85, 0);
      Blazerod.addBox(0F, 0F, 0F, 1, 11, 1);
      Blazerod.setRotationPoint(-0.5F, 12F, -0.5F);
      Blazerod.setTextureSize(128, 64);
      Blazerod.mirror = true;
      setRotation(Blazerod, 0F, 0F, 0F);
      Cauldron2Leg1 = new ModelRenderer(this, 0, 40);
      Cauldron2Leg1.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron2Leg1.setRotationPoint(1F, 22F, -3F);
      Cauldron2Leg1.setTextureSize(128, 64);
      Cauldron2Leg1.mirror = true;
      setRotation(Cauldron2Leg1, 0F, 0F, 0F);
      Cauldron2Leg2 = new ModelRenderer(this, 0, 40);
      Cauldron2Leg2.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron2Leg2.setRotationPoint(6F, 22F, -3F);
      Cauldron2Leg2.setTextureSize(128, 64);
      Cauldron2Leg2.mirror = true;
      setRotation(Cauldron2Leg2, 0F, 0F, 0F);
      Cauldron2Leg3 = new ModelRenderer(this, 0, 40);
      Cauldron2Leg3.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron2Leg3.setRotationPoint(6F, 22F, 2F);
      Cauldron2Leg3.setTextureSize(128, 64);
      Cauldron2Leg3.mirror = true;
      setRotation(Cauldron2Leg3, 0F, 0F, 0F);
      Cauldron2Leg4 = new ModelRenderer(this, 0, 40);
      Cauldron2Leg4.addBox(0F, 0F, 0F, 1, 1, 1);
      Cauldron2Leg4.setRotationPoint(1F, 22F, 2F);
      Cauldron2Leg4.setTextureSize(128, 64);
      Cauldron2Leg4.mirror = true;
      setRotation(Cauldron2Leg4, 0F, 0F, 0F);
      Cauldron2Body1 = new ModelRenderer(this, 0, 53);
      Cauldron2Body1.addBox(0F, 0F, 0F, 6, 5, 6);
      Cauldron2Body1.setRotationPoint(1F, 17F, -3F);
      Cauldron2Body1.setTextureSize(128, 64);
      Cauldron2Body1.mirror = true;
      setRotation(Cauldron2Body1, 0F, 0F, 0F);
      Cauldron2Body2 = new ModelRenderer(this, 30, 56);
      Cauldron2Body2.addBox(0F, 0F, 0F, 5, 3, 5);
      Cauldron2Body2.setRotationPoint(1.5F, 14F, -2.5F);
      Cauldron2Body2.setTextureSize(128, 64);
      Cauldron2Body2.mirror = true;
      setRotation(Cauldron2Body2, 0F, 0F, 0F);
      Cauldron2Body3 = new ModelRenderer(this, 0, 47);
      Cauldron2Body3.addBox(0F, 0F, 0F, 2, 1, 2);
      Cauldron2Body3.setRotationPoint(3F, 13F, -1F);
      Cauldron2Body3.setTextureSize(128, 64);
      Cauldron2Body3.mirror = true;
      setRotation(Cauldron2Body3, 0F, 0F, 0F);
      Cauldron2Body4 = new ModelRenderer(this, 0, 35);
      Cauldron2Body4.addBox(0F, 0F, 0F, 1, 3, 1);
      Cauldron2Body4.setRotationPoint(3.5F, 10F, -0.5F);
      Cauldron2Body4.setTextureSize(128, 64);
      Cauldron2Body4.mirror = true;
      setRotation(Cauldron2Body4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base1.render(f5);
    Base2.render(f5);
    Base3.render(f5);
    Base4.render(f5);
    Base5.render(f5);
    Base6.render(f5);
    Base7.render(f5);
    Cauldron1Leg1.render(f5);
    Cauldron1Leg2.render(f5);
    Cauldron1Leg3.render(f5);
    Cauldron1Leg4.render(f5);
    Cauldron1Body1.render(f5);
    Cauldron1Body2.render(f5);
    Cauldron1Body3.render(f5);
    Cauldron1Body4.render(f5);
    Base8.render(f5);
    Blazerod.render(f5);
    Cauldron2Leg1.render(f5);
    Cauldron2Leg2.render(f5);
    Cauldron2Leg3.render(f5);
    Cauldron2Leg4.render(f5);
    Cauldron2Body1.render(f5);
    Cauldron2Body2.render(f5);
    Cauldron2Body3.render(f5);
    Cauldron2Body4.render(f5);
  }
  
  public void render(float f5){
	  
	    Base1.render(f5);
	    Base2.render(f5);
	    Base3.render(f5);
	    Base4.render(f5);
	    Base5.render(f5);
	    Base6.render(f5);
	    Base7.render(f5);
	    Cauldron1Leg1.render(f5);
	    Cauldron1Leg2.render(f5);
	    Cauldron1Leg3.render(f5);
	    Cauldron1Leg4.render(f5);
	    Cauldron1Body1.render(f5);
	    Cauldron1Body2.render(f5);
	    Cauldron1Body3.render(f5);
	    Cauldron1Body4.render(f5);
	    Base8.render(f5);
	    Blazerod.render(f5);
	    Cauldron2Leg1.render(f5);
	    Cauldron2Leg2.render(f5);
	    Cauldron2Leg3.render(f5);
	    Cauldron2Leg4.render(f5);
	    Cauldron2Body1.render(f5);
	    Cauldron2Body2.render(f5);
	    Cauldron2Body3.render(f5);
	    Cauldron2Body4.render(f5);
	  
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
